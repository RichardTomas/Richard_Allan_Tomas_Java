package com.example.m2challengetomasrichardallan.controller;

import com.example.m2challengetomasrichardallan.exception.ArgumentNotValidException;
import com.example.m2challengetomasrichardallan.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// referenced record store class activity on Oct 4, 2022
@RestController
public class MonthController {

    private static int monthNumber;

    private List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1,"January"),
            new Month(2,"February"),
            new Month(3,"March"),
            new Month(4,"April"),
            new Month(5,"May"),
            new Month(6,"June"),
            new Month(7,"July"),
            new Month(8,"August"),
            new Month(9,"September"),
            new Month(10,"October"),
            new Month(11,"November"),
            new Month(12,"December")
    ));
    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthByNumber(@PathVariable int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new ArgumentNotValidException("Month number must be between 1 and 12");
        }
        for (int i = 0; i < monthList.size(); i++) {
            if (monthList.get(i).getNumber() == monthNumber) {
                return monthList.get(i);
            }
        }
        return null;

    }
    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getRandomMonth() {
        Random randomGenerator = new Random();

        Month monthObject = monthList.get(randomGenerator.nextInt(monthList.size()));
        return monthObject.toString();
//        return monthObject.getMonth();    // displays only Month
    }
}

package com.example.m2challengetomasrichardallan.controller;

import com.example.m2challengetomasrichardallan.model.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {

    }
    @Test
    public void shouldReturnMonthName() throws Exception {
        Month outputMonth = new Month(3,"March");

        String outputMonthJson = mapper.writeValueAsString(outputMonth);

        mockMvc.perform(get("/month/{monthNumber}", 3))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputMonthJson));
    }

    @Test
    public void shouldReturn422IfNumberIsNotInList() throws Exception {
        Month outputMonth = new Month();

        String outputMonthJson = mapper.writeValueAsString(outputMonth);

        mockMvc.perform(get("/month/{monthNumber}", 15))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void returnsRandomMonthObjectForRandomMonth() throws Exception {

        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk());
    // results are month number and month name but is not JSON
    }
}
package com.example.m2challengetomasrichardallan.model;


import javax.validation.constraints.NotNull;
import java.util.Objects;
// referenced record store class activity on Oct 4, 2022
public class Month {

    @NotNull(message = "Please provide a number.")
    private int number;
    private String month;

    public Month() { }

    public Month(int number, String month) {
        this.number = number;
        this.month = month;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month1 = (Month) o;
        return number == month1.number && Objects.equals(month, month1.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, month);
    }

    @Override
    public String toString() {
        return "Month{" +
                "number=" + number +
                ", month='" + month + '\'' +
                '}';
    }
}

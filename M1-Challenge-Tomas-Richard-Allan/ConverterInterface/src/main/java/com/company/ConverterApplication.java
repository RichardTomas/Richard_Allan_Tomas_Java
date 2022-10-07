package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf usingIfElse = new ConverterIf();
        ConverterSwitch usingSwitch = new ConverterSwitch();

        System.out.println(usingIfElse.convertMonth(8)+ " is the 8th month of the year.");
        System.out.println(usingIfElse.convertDay(3)+ " is the 3rd day of the week.");
        System.out.println(usingSwitch.convertMonth(5)+ " is the 5th month of the year.");
        System.out.println(usingIfElse.convertDay(4)+ " is the 4th day of the week.");
    }
}

package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter mmddyyyFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter mFullFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String mdyDate = today.format(mmddyyyFormatter);
        String mFullDate = today.format(mFullFormatter);

        //LocalDate Date = LocalDate.parse(today, mmddyyyFormatter);

        System.out.println(mdyDate);
        System.out.println(today);
        System.out.println(mFullDate);

    }
}

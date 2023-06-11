/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Igrar
 */
public class DemoDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date d2 = new Date();
        System.out.println(d2);

        d2.toString();

        long l = d2.getTime();
        System.out.println(l);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS");
        String myDate = sdf.format(d2);
        System.out.println(myDate);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
        String s = "14.08.1999";
        Date d1 = sdf2.parse(s);
        System.out.println(d1);
        System.out.println(sdf2.format(d1));
        System.out.println(sdf2.parse(s));

//--------------------------------------------------------------//
        // d1, d2 are dates
        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.print(diffDays + " days, ");
        System.out.print(diffHours + " hours, ");
        System.out.print(diffMinutes + " minutes, ");
        System.out.print(diffSeconds + " seconds.");

//--------------------------------------------------------------//        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime dateTime1 = LocalDateTime.parse("2014-11-25 19:00:00", formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse("2014-11-25 16:00:00", formatter);

        long diffInMilli = java.time.Duration.between(dateTime1, dateTime2).toMillis();
        long diffInSeconds = java.time.Duration.between(dateTime1, dateTime2).getSeconds();
        long diffInMinutes = java.time.Duration.between(dateTime1, dateTime2).toMinutes();
        
        
        System.out.println("\ndiffInMinutes = "+diffInMinutes);
    }

}

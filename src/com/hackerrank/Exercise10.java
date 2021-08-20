package com.hackerrank;

/**
 * Description: Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *              Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 *              - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * @author Argishti_Tigranyan
 */

public class Exercise10 {
    public static String timeConversion(String s) {

        String stringHour = s.substring(0, 2);
        char amOrPm = s.charAt(s.length() - 2);
        int intHour = Integer.parseInt(stringHour);
        String repetitiousPart = s.substring(2, s.length()-2);

        if(amOrPm == 'P' && intHour < 12){
           return (intHour+12)+repetitiousPart;
        }
        else if((amOrPm == 'P') || (amOrPm == 'A' && intHour < 12)){
            return s.substring(0, s.length()-2);
        }
        return "0"+(intHour-12)+repetitiousPart;
    }
}

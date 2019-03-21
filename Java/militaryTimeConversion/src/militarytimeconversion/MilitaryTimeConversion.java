/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package militarytimeconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author vishnukdawah
 */
public class MilitaryTimeConversion {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//       String s = "07:05:45PM";
//       
//      // remove AM/PM from string to avoid parsing issues
//       s = s.replace("AM", "");
//       s = s.replace("PM", "");
//       
//       
//       DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
//       LocalTime givenTime = LocalTime.parse(s,f);
//        System.out.println(givenTime);
//        
//        
//        
//        
//    }
    
    public static void main(String[] args) {
            
       String s = "07:05:45PM";
       
             // remove AM/PM from string to avoid parsing issues
       s = s.replace("AM", "");
       s = s.replace("PM", "");

       //Create formatter
       DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("HH:mm:ss a");
 
       //Local time instance
       LocalTime localTime = LocalTime.parse(s);
 
      //Get formatted String
      String localTimeString = FOMATTER.format(localTime);
 
      System.out.println(localTimeString); 
        
        
        
        
    }
    
}
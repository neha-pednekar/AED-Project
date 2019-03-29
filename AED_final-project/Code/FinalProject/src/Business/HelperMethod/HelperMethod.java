/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelperMethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Neha Pednekar
 */
public class HelperMethod {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_US_ZIPCODE_REGEX
            = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");

    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    
    public static boolean validateZipCode(String zipCodeStr) {
        Matcher matcher = VALID_US_ZIPCODE_REGEX.matcher(zipCodeStr);
        return matcher.find();
    }
    
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  
    }
    
    
    

}

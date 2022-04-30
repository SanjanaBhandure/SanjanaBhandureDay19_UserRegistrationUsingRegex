package com.Bridgelabz.Day19_RegexUserRegistrationProblem;

import java.util.regex.Pattern;

public class UserRegister {
    /*
     * isValidFirstName method created in which First Name starts with Cap and has minimum 3 Characters.
     */
    public static boolean isValidFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName);
    }

    /*
     * lastName method created in which Last Name starts with Cap and has minimum 3 Characters.
     */
    public static boolean isValidLastName(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
    }
}

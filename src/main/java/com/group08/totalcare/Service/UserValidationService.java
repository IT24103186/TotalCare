package com.group08.totalcare.Service;

import com.group08.totalcare.Entity.User;

public class UserValidationService {

    //NIC Validation
    public boolean validateNIC(String nic) {
        if (nic.length() == 12 && nic != null ) {
            return true;
        }
        else{
            return false;
        }
    }

    //Name Validation
    public boolean validateName(String name) {
        if (name != null) {
            return true;
        }
        else{
            return false;
        }
    }

    //Address Validation
    public boolean validateAddress(String address) {
        if (address != null) {
            return true;
        }
        else{
            return false;
        }
    }

    //Email Validation
    public boolean validateEmail(String email) {
        if (email.contains("@") && email != null ) {
            return true;
        }
        else{
            return false;
        }
    }

    //Phone Validation
    public boolean validatePhone(String phone) {
        if (phone.length() == 10 && phone.startsWith("0") && phone != null ) {
            return true;
        }
        else{
            return false;
        }
    }

    //Password Validation
    public boolean validatePassword(String password) {
        if (password != null) {
            return true;
        }
        else{
            return false;
        }
    }

    //Role Validation
    public boolean validateRole(String role) {
        if (role != null) {
            return true;
        }
        else{
            return false;
        }
    }


    //Registration Validation
    public boolean validateRegistration(User user,String password) {
        return validateNIC(user.getNIC())
                && validateName(user.getName())
                && validateAddress(user.getAddress())
                && validateEmail(user.getEmail())
                && validatePhone(user.getPhone());
    }

    //Login Validation
    public boolean validateLogin(String email, String password) {
        return validateEmail(email) && validatePassword(password);
    }

}

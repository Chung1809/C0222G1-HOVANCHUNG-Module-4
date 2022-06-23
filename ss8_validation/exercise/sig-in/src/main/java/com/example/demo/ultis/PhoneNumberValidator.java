package com.example.demo.ultis;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberConstraint,String> {

    @Override
    public void initialize(PhoneNumberConstraint constraintAnnotation) {

    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || "".equals(value) || value.trim().equals("") ){
            return false;

        }
        return value.matches("^((84)|(0)[3|5|7|8|9])([0-9]{8})$");
    }
}

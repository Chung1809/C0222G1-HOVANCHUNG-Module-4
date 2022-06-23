package com.example.demo.ultis;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LastNameValidator implements ConstraintValidator<LastNameConstraint,String> {

    @Override
    public void initialize(LastNameConstraint constraintAnnotation) {

    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || "".equals(value) || value.trim().equals("") ){
            return false;
        }
        return value.matches("^[A-Za-z ]{5,45}$");
    }
}

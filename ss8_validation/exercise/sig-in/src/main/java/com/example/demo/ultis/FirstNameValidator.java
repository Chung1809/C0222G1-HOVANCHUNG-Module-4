package com.example.demo.ultis;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstNameValidator implements ConstraintValidator<FirstNameConstraint,String> {

    @Override
    public void initialize(FirstNameConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || "".equals(value) || value.trim().equals("") ){
            return false;
        }
        return value.matches("^[A-Za-z ]{5,45}$");
    }
}

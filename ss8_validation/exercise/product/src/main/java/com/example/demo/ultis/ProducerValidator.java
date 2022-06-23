package com.example.demo.ultis;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProducerValidator implements ConstraintValidator<ProducerConstraint,String> {
    @Override
    public void initialize(ProducerConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || "".equals(value) || value.trim().equals("") ){
            return false;
        }
        return value.matches("^[A-Z a-z]{2,800}$");
    }
}

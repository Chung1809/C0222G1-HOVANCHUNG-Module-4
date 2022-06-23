package com.example.demo.ultis;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TypeMusicValidator implements ConstraintValidator<TypeMusicConstraint,String> {
    @Override
    public void initialize(TypeMusicConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || "".equals(value) || value.trim().equals("") ){
            return false;
        }
        return value.matches("^[A-Za-z,]{2,1000}$");
    }
}

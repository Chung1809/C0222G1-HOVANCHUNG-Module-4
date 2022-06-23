package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface PhoneNumberConstraint  {
    String message() default "Phone không đúng định dạng : (84|0[3|5|7|8|9])+([0-9]{8}) ";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
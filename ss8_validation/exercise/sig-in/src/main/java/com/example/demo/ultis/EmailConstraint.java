package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = EmailValidator.class)
public @interface EmailConstraint {
    String message() default "Email không đúng định dạng : abc@gmail.com";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

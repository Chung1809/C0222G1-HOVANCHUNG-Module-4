package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameProductValidator.class)
public @interface NameProductConstraint {
    String message() default "Tên không đúng định dạng : [A-Za-z]{2,800}";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PriceValidator.class)
public @interface PriceConstraint {
    String message() default "Giá không đúng định dạng : ^[0-9]+";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

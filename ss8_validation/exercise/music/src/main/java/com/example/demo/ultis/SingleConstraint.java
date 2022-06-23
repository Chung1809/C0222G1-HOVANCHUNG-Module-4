package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = SingleValidator.class)
public @interface SingleConstraint {
    String message() default "Ca sĩ không đúng định dạng :  [A-Za-z]{2,300}";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

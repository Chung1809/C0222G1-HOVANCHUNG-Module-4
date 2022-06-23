package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = FirstNameValidator.class)
public @interface FirstNameConstraint  {
    String message() default "Tên không đúng định dạng : [A-Za-z]{5,45}";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

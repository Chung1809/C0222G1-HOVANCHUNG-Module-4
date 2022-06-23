package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = DescriptionValidator.class)
public @interface DescriptionConstraint {
    String message() default "Giới thiệu sản phẩm không đúng định dạng : [A-Za-z]{2,800}";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

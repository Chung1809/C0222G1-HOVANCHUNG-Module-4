package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ProducerValidator.class)
public @interface ProducerConstraint {
    String message() default "Nhà sản xuất không đúng định dạng : [A-Za-z]{2,800}";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

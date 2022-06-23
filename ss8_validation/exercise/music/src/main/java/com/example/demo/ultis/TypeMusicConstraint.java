package com.example.demo.ultis;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = TypeMusicValidator.class)
public @interface TypeMusicConstraint {
    String message() default "Thể loại nhạc không đúng định dạng :  [A-Za-z]{2,1000}";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

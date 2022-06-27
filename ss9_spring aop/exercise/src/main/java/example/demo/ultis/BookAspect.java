package example.demo.ultis;

import example.demo.model.Book;
import example.demo.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    @After("execution(* example.demo.controller.BookController.borrowBook(..)) ")
    public void logAfterMethodController(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        System.err.println("The method just called is:" + method);
    }

    private int countVisitor = 0;

    @Pointcut("within(example.demo.controller.BookController*) ")
    public void allControllerPointCut() {
    }

    @After("allControllerPointCut()")
    public void countVisitor() {
        System.out.println("------------------");
        System.err.println("The number of visitor = " + countVisitor++);
    }
}

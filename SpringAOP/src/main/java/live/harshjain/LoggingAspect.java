package live.harshjain;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* live.harshjain.ShoppingCart.checkout(..))")
    public void beforelogger(JoinPoint jp)
    {
//        System.out.println(jp.getSignature());
        System.out.println(jp.getArgs()[0].toString());
        System.out.println("Before Logger");
    }
    @After("execution(* live.harshjain.ShoppingCart.checkout(..))")
    public void afterlogger()
    {
        System.out.println("After Logger");
    }
    @Pointcut("execution(* live.harshjain.ShoppingCart.checkout(..))")
    public void afterReturningPointCut()
    {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retval")
    public void afterReturning(String retval)
    {
        System.out.println("After Returning"+retval);
    }


}

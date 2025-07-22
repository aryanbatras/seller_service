package com.sashel.seller_service.logging;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    private static final Logger log = LoggerFactory.getLogger(LoggerAspect.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Pointcut(
            "execution(public * com.sashel.seller_service.controller..*(..)) || " +
            "execution(public * com.sashel.seller_service.service..*(..)) || " +
            "execution(public * com.sashel.seller_service.repository..*(..))"
    )
    public void loggableEndpoints() {}

    @Around("loggableEndpoints()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        var className = joinPoint.getSignature().getDeclaringType().getSimpleName();
        var method = joinPoint.getSignature().getName();
        var args = joinPoint.getArgs();

        log.info(
                "\uD83D\uDD39 Entering {}.{} with args {}",
                className,
                method,
                objectMapper.writeValueAsString(
                        joinPoint.getArgs()
                )
        );

        var result = joinPoint.proceed();
        return logExecution(result, className, method);
    }

    public Object logExecution(Object result, String className, String method) throws Throwable {
        try {
            log.info(
                    " \uD83D\uDC9B Exiting {}.{} with result {}",
                    className,
                    method,
                    objectMapper.writeValueAsString(
                            result
                    )
            );
            return result;

        } catch (Throwable ex) {
            log.error(
                    " ❌ Exception in {}.{}: {}",
                    className,
                    method,
                    ex.getMessage(),
                    ex
            );
            throw ex;
        }
    }
}

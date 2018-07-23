package com.thbs.mis.log;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class RestAccessLogger {

	@Autowired
	private HttpServletRequest request;

	@Before("execution(* com.thbs.mis.controller.*Controller.*(..))")
	public void logEntering(JoinPoint joinPoint) {

		AppLog log = LogFactory.getLog(joinPoint.getTarget().getClass());
		log.debug("Received request1 " + request.getRequestURL());
		log.info("Entering method :- " + joinPoint); //Added By Nibedita
		System.out.println("I am in the logger");
	}

	@After("execution(* com.thbs.mis.controller.*Controller.*(..))")
	public void logExeting(JoinPoint joinPoint) {

		AppLog log = LogFactory.getLog(joinPoint.getTarget().getClass());
		log.debug("Received request1 " + request.getRequestURL());
		log.info("Exiting method :- " + joinPoint); //Added By Nibedita
		System.out.println("I am in the logger");
	}
}

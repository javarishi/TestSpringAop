package com.learn.spring.aop;

public class LoggerAspect {
	
	/**
	 * Aspect Constructor
	 */
	public LoggerAspect() {
		System.out.println("LoggerAspect Constructor");
	}
	
 /** 
 * This is the method which I would like to execute
 * before a selected method execution.
 */
  public void beforeAdvice(){
     System.out.println("LoggerAspect :: Going to setup customer profile.");
  }
  
  /** 
     * This is the method which I would like to execute
     * after a selected method execution.
  */
  public void afterAdvice(){
     System.out.println("LoggerAspect :: customer profile has been setup.");
  }

  /** 
     * This is the method which I would like to execute
     * when any method returns a value : retVal.
  */
  public void afterReturningAdvice(Object retVal) {
     System.out.println("LoggerAspect :: Returning: " + retVal.toString() );
  }

  /**
     * This is the method which I would like to execute
     * if there is an exception raised. Exception : ex
  */
  public void afterThrowingAdvice(Exception ex){
     System.out.println("LoggerAspect :: There has been an exception: " + ex.toString());   
  }

}

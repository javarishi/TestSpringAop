package com.learn.spring.aop;

public class TestAopBean {
	
	private String testVariable;
	
	public TestAopBean() {
		//System.out.println("Test AOP Bean Initialized");
	}

	/**
	 * @return the testVariable
	 * @throws Exception 
	 */
	public String getTestVariable() throws Exception {
		int count = 0;
		for(int i=0; i< 10; i++) {
			count = count + i;
		}
		if(count == 45) {
			throw new Exception("Testing Aspect Oriented Programming");
		}
		System.out.println("TestAopBean:: Count :: " + count);
		testVariable = "Count :: " + count;
		return testVariable;
	}

	/**
	 * @param testVariable the testVariable to set
	 */
	public void setTestVariable(String testVariable) {
		this.testVariable = testVariable;
	}

	
}

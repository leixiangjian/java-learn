package com.lambda.learn;

public class RunnableLearn {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
	}
}

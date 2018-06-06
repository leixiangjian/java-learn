package com.lambda.learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLearn {

	public static void main(String[] args) {
		List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
//
//		System.out.println("Languages which starts with J :");
//		filter(languages, (str) -> ((String) str).startsWith("J"));
//
//		System.out.println("Languages which ends with a ");
//		filter(languages, (str) -> ((String) str).endsWith("a"));
//
//		System.out.println("Print all languages :");
//		filter(languages, (str) -> true);
//
//		System.out.println("Print no language : ");
//		filter(languages, (str) -> false);
//
//		System.out.println("Print language whose length greater than 4:");
//		filter(languages, (str) -> ((String) str).length() > 4);
		
		
		Predicate<String> startsWithJ = (n) -> n.startsWith("J");
		Predicate<String> fourLetterLong = (n) -> n.length() == 4;
		languages.stream()
		    .filter(startsWithJ.and(fourLetterLong))
		    .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));

	}

	public static void filter(List<String> names, Predicate condition) {
//		for (String name : names) {
//			if (condition.test(name)) {
//				System.out.println(name + " ");
//			}
//		}
		
		names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
	        System.out.println(name + " ");
	    });
		
		
	}

}

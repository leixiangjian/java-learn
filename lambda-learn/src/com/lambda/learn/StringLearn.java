package com.lambda.learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLearn {

	public static void main(String[] args) {
		String[] strs = {"abc","" , "bcd", "", "defg", "jk"};
		List<String> strList = Arrays.asList(strs);
		List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
		System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
		
		
		// 将字符串换成大写并用逗号链接起来
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);
	}

}

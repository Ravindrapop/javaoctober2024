package com.rsg.variables;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfInteger {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9);

		List<Integer> duplicate = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey())
				.collect(Collectors.toList());
		
		System.out.println(duplicate);
	}

}

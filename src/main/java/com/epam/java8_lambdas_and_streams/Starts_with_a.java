package com.epam.java8_lambdas_and_streams;

import java.util.*;
import java.util.stream.Collectors;

public class Starts_with_a {
	public static List<String> search(List<String> list) {
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list of strings :");
		int n = sc.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++){
			arr.add(sc.next());
		}
		System.out.println("List of Strings : "+search(arr));
	}
}


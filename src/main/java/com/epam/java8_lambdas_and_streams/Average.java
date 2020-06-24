package com.epam.java8_lambdas_and_streams;

import java.util.*;

public class Average {
	public static double Average(ArrayList<Integer> a){
        double sum = 0;
        for (int i : a) {
              sum += i; 
        }
        return ( sum / a.size());
    }
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n ; i++)
			arr.add(sc.nextInt());
		System.out.println("Average is : " + Average(arr));
	}
}

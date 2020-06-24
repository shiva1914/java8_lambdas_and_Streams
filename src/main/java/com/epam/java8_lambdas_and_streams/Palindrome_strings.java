package com.epam.java8_lambdas_and_streams;
import java.util.*;
import java.util.function.Predicate;
public class Palindrome_strings {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    List<String> a = new ArrayList<>();
	    for(int i = 0; i < n; i++){
	        a.add(sc.next());
	    }
		List<String> palindromes = findPalindromes(a, Palindrome::checkPalindrome);
		System.out.println("List of Palindromes : " + palindromes);
	}
	public static List<String> findPalindromes(List<String> strList, Predicate<String> predicate) {
		List<String> resList = new ArrayList<String>();
		for(String s : strList)
			if(predicate.test(s))
				resList.add(s);
		return resList;
	}
}
class Palindrome{
	public static boolean checkPalindrome(String str){
		for(int i = 0,j = str.length()-1; i < j; i++,j--)
			if(str.charAt(i) != str.charAt(j))
				return false;
		return true;
	}
}
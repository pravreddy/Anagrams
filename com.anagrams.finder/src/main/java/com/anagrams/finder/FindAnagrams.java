package com.anagrams.finder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FindAnagrams {

	public static void main(String[] args){
		AnagramFinder finder = new AnagramFinder();
		HashMap<String, ArrayList<String>> map=null;
		try {
			map = finder.findAnagrams("/input2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printAnagrams(map);
		printLongestWordAnagramSet(map,finder.getLongestWord());
		printMostWordsAnagramSet(map,finder.getMostWords());		
		
	}
	
	public static void printAnagrams(HashMap<String, ArrayList<String>>map)
	{
		System.out.println("Anagrams found");
		for (String word:map.keySet()) {
			
			ArrayList<String> list = map.get(word);
			for (String anagram : list) {
				System.out.print(anagram + ",");
			}
			
			System.out.println(" ");
		}
	}
	
	public static void printLongestWordAnagramSet(HashMap<String, ArrayList<String>>map,String longestWordKey)
	{
	   System.out.println("Longest Anagram set");
	   ArrayList<String> longestWordSet = map.get(longestWordKey);
	   for (String anagram : longestWordSet) {
		System.out.print(anagram + ",");
	   }
	   System.out.println("");
	}
	
	public static void printMostWordsAnagramSet(HashMap<String, ArrayList<String>>map,String mostWordsKey)
	{
		System.out.println("Most words Anagram set");
		ArrayList<String> mostWordsSet = map.get(mostWordsKey);
		for (String anagram : mostWordsSet) {
			System.out.print(anagram + ",");
		}		
	}
}

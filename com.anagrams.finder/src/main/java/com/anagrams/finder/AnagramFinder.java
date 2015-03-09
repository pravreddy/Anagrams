package com.anagrams.finder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramFinder {

	private HashMap<String, ArrayList<String>> anagramMap;
	
	private String longestWord;
	private String mostWords;
	
	public String getLongestWord() {
		return longestWord;
	}
	public String getMostWords() {
		return mostWords;
	}

	
	/**
	 * Reads the file line by line , finds anagrams for a word
	 * creates and returns a map of word and its anagramsList
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public HashMap<String, ArrayList<String>> findAnagrams(String filePath) throws IOException
	{
		Scanner fileScanner = new Scanner( getFile(filePath));

		int wordLength=0;
		int largerSet=1;
		anagramMap =  new HashMap<String, ArrayList<String>>();

		while( fileScanner.hasNextLine() )
		{
			String word = fileScanner.nextLine();
			String sortedWord = sortString(word); 

			ArrayList<String> anagrams = anagramMap.get( sortedWord );  

			if( anagrams == null ) {
				anagrams = new ArrayList<String>();
			}else{
				if(sortedWord.length()>wordLength){
					wordLength=sortedWord.length();
					longestWord=sortedWord;					
				}
				if(anagrams.size()>largerSet){
					largerSet=anagrams.size()+1;
					mostWords=sortedWord;
				}
			}

			anagrams.add(word);
			anagramMap.put(sortedWord, anagrams);
		}
		fileScanner.close();
		return anagramMap;

	}
	
	/**
	 * Gets the file from the resource folder
	 * @param fileName
	 * @return
	 */
	private File getFile(String fileName)
	{
		return new File( this.getClass().getResource(fileName).getFile() );
	}
	/**
	 * Sorts the word
	 * @param inputString
	 * @return
	 */
	public String sortString( String inputString )
	{
		char[] charArray = inputString.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}

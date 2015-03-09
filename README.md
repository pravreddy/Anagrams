# Anagrams
How to run:
----------
Import this in to eclipse workspace as maven project.
FindAnagrams.java is the main class.
Right click on it and select Run As Java Application to run the program.
It picks the input2.txt from src/main/resources folder and print the result on the console.

input2.txt has one word per line.

AnagramFinder.java 
1.takes the file name as input and reads the file line by line
2.sorts the word read from the file
3.adds the sorted word as key to the map and its value is a list of anagrams for that word.
4.also finds the longestWord and mostWords anagram sets in this process 


UnitTests:
----------

AnagramTest.java contains unit tests written to test this program.
The input for this tests are in src/test/resources.

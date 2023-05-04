/* SELF ASSESSMENT 

1. readDictionary
- I have the correct method definition [Mark out of 5: 5]
- Comment: Yes, the method readDictionary works appropriately by reading words from the "words.txt" file and returns the contents from "words.txt" in a String array.
- My method reads the words from the "words.txt" file. [Mark out of 5: 5]
- Comment: Yes, the method correctly reads all the words from "words.txt" file.
- It returns the contents from "words.txt" in a String array or an ArrayList. [Mark out of 5:]
- Comment: Yes, the method appropriately returns the contents from "words.txt" in a String array.

2. readWordList
- I have the correct method definition [Mark out of 5: 5]
- Comment: Yes, the method readWordList appropriately takes in and reads a comma (,) separated String of words and returns the list represented as an array.
- My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it. [Mark out of 5: 5]
- Comment: Yes, as specified the method reads the words and saves them to an array or ArrayList of String references and returns it.

3. isUniqueList
- I have the correct method definition [Mark out of 5: 5]
- Comment:  Yes, the method appropriately takes in an String[] Array of words and determines if list contains two String values at different locations in the array are equal and returns a boolean accordingly.
- My method compares each word in the array with the rest of the words in the list. [Mark out of 5: 5]
- Comment: Yes, using two nested for loops looping through the array my method compares each word in the array with the rest of the words in the list.
- Exits the loop when a non-unique word is found. [Mark out of 5: 5]
- Comment: Yes, using break statements both the loop are immediately terminated if non unique words are found.
- Returns true is all the words are unique and false otherwise. [Mark out of 5: 5]
- Comment: Yes, the method appropriately returns true if all the words are unique and false otherwise.

4. isEnglishWord
- I have the correct method definition [Mark out of 5:5]
- Comment: Yes the method appropriately takes in a String value and determines whether the String value is an English word by searching through the words in text file stored as an array.
- My method uses the binarySearch method in Arrays library class. [Mark out of 3: 3]
- Comment: Yes, my method appropriately uses binarySearch method to accomplish the task efficiently.
- Returns true if the binarySearch method return a value >= 0, otherwise false is returned. [Mark out of 2:2]
- Comment: Yes, the method returns true if inarySearch method return a value >= 0, otherwise false is returned.

5. isDifferentByOne
- I have the correct method definition [Mark out of 5: 5]
- Comment: Yes,the method appropriately takes in two Strings and determines whether the two Strings are of the same length and differ by exactly one character only.
- My method loops through the length of a words comparing characters at the same position in both words searching for one difference. [Mark out of 10: 10]
- Comment: Yes, the method loops through the length of a words comparing characters at the same position in both words searching for one difference.

6. isWordChain
- I have the correct method definition [Mark out of 5: 5]
- Comment: Yes, the method appropriately takes in a list of words represented as an array and determines whether the list of words is a valid chain of words for Lewis Carroll's word-links game and returns a boolean accordingly.
- My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message [Mark out of 10:]
- Comment: Yes, the method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message.

7. main
- Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures [Mark out of 10: 10]
- Comment: Yes, the code appropriately reads all the words from file words.txt into an array using the Java.IO.
- Asks the user for input and calls isWordChain [Mark out of 5: 5]
- Comment: Yes, main appropriately asks the users for input and calls isWordChain to execute the program.

 Total Mark out of 100 (Add all the previous marks): 100
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
public class Lewiscar {
	
	public static String[] readDictionary() {
		
		ArrayList<String> words = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader("words.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			boolean endText = false;
			while (!endText) {
				String newWord = bufferedReader.readLine();
				if (newWord == null) {
					endText = true;
				} else {
					words.add(newWord);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String dictionary[] = words.toArray(new String[words.size()]);
		return dictionary;
	}
	
	public static String[] readWordList(String userWords) {
		String[] wordsArray = userWords.split(", ");
		return wordsArray;
	}
	
	public static boolean isUniqueList(String[] wordArray) {
		
		boolean isUnique=true;
		
		if (wordArray.length!=0 && wordArray!=null) {
			
			for (int i=0;i<wordArray.length;i++) {
				
				if (!isUnique) {
					break;
				}
				
				String word1 = wordArray[i];
				
				for (int j=0;j<wordArray.length;j++) {
					
					String word2 = wordArray[j];
					
					if (word1.equalsIgnoreCase(word2) && i!=j) {
						
						isUnique = false;
						break;
					}
				}
			}
		}
		
		return isUnique;
	}
	
	public static boolean isEnglishWord(String word) {
		
		boolean isWord=false;
		String[] dictionary = readDictionary();
		Arrays.sort(dictionary);
		int index= Arrays.binarySearch(dictionary, word);
		if (index>=0) {
			
			isWord = true; 
		}
		
		return isWord;
	}
	
	public static boolean isDifferentByOne(String word1, String word2) {
		
		boolean isDiffernt = false;
		
		ArrayList<String> string1 = new ArrayList();
		ArrayList<String> string2 = new ArrayList();
		
		String[] arrayString1 = word1.split("");
		String[] arrayString2 = word2.split("");
		
		boolean isSameLength = false;
		
		if (arrayString1.length==arrayString2.length) {
			
			isSameLength = true;
		}
		
		for (int i = 0; i < arrayString1.length; i++) {
			
			string1.add(arrayString1[i]);
		}
		for (int i = 0; i < arrayString2.length; i++) {
			
			string2.add(arrayString2[i]);
		}
		
		boolean diffByOne = false;
		if (isSameLength==true) {
			
			for (int i = 0; i < string1.size(); i++) {
				
				for (int j = 0; j < string2.size(); j++) {
					
					String letter1=string1.get(i);
					String letter2=string2.get(j);
					if (letter1.equalsIgnoreCase(letter2)) {
						
						string1.remove(i);
						i-=1;
						string2.remove(j);
						j-=1;
						break;
					}
				}
			}
			
			if (string1.size()==string2.size() && string1.size()==1) {
				
				diffByOne = true;
			}
			
		}
		
		if (isSameLength==true && diffByOne == true) {
			
			isDiffernt = true;
		}
		
		return isDiffernt;
	}
	
	public static boolean isWordChain(String[] wordArray) {
		
		boolean isUnique = isUniqueList(wordArray);
		boolean isDifferent = true;
		boolean isWord = true;
		boolean isChain = false;
		
		if (isUnique) {
			
			for (int i = 0; i < wordArray.length-1; i++) {
				
				String word1 = wordArray[i];
				String word2 = wordArray[i+1];
				
				if (!isDifferentByOne(word1,word2)) {
					
					isDifferent = false;
					break;
				}
			}
			for (int i = 0; i < wordArray.length; i++) {
				
				String word = wordArray[i];
				if (!isEnglishWord(word)) {
					
					isWord= false;
					break;
				}
				
			}
			
			
		}
		
		if ( isUnique && isDifferent && isWord) {
			
			isChain = true;
		}
		
		if (isChain) {
			System.out.println("Valid chain of words from Lewis Carroll's word-links game.");
		}
		else {
			System.out.println("Not a valid chain of words from Lewis Carroll's word-links game.");
		}
		
		return isChain;
	}

	public static void main(String[] args) {
		
		boolean quit = false;
		Scanner input= new Scanner(System.in);
		while (!quit) {
			
			System.out.print("Enter a comma separated list of words (or an empty list to quit):");
			String userWords = input.nextLine();
			String[] wordList = readWordList(userWords);
			if (wordList.length == 1 || userWords.equals("")) {
				quit=true;
				break;
			}
			isWordChain(wordList);
		}
	}
}

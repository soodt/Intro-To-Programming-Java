import java.io.*;  
import java.util.*;
public class FileIO {
	
	public static String findLongestWord(){
		
		
		String longestWord="";
		String currentWord="";
		FileReader fr;
		try {
			fr = new FileReader("example.txt");
		 
		BufferedReader br = new BufferedReader(fr);    
		while (br.readLine()!=null) {
		
		if (longestWord.length()<currentWord.length()) {
			
			longestWord=currentWord;
			
		}
		}
		br.close();    
		fr.close();
		}
		catch (IOException e) {
			e.printStackTrace();
	}   
		
		return longestWord;
	
		
	}
	public static ArrayList<String> fileToArray() {
		
	ArrayList<String> text = new ArrayList<String>();
		
		    
	FileReader fr;
	try {
		fr = new FileReader("example.txt");
	 
	BufferedReader br = new BufferedReader(fr);    
	
	while (br.readLine()!=null) {
		
	}
	
		  
	
	br.close();    
	fr.close();    
	} catch (IOException e) {
		e.printStackTrace();
}   
	
	return text;
		    }    
	
	

	public static void main(String[] args) {
		
		System.out.println("The Longest word in the file is" +findLongestWord());

	}
	
	

}

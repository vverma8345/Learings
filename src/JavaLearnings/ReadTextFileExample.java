package JavaLearnings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileExample {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\002S4W744\\workspace\\Learnings\\Data.txt";
		BufferedReader bf = new BufferedReader(new FileReader(filePath));
		String line = bf.readLine();
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
	
		while(line!=null) 
		{
			// Printing data from txt file 
			System.out.println(line);
			
			// Printing no of char
			char[] Chars = line.toCharArray();
			charCount += Chars.length;
			// Printing no of word
		    String[] words = line.split(" ");
		    wordCount += words.length;
		    line = bf.readLine();
		  // Printing no of word
			lineCount++;
			
		
			
		}
		
		System.out.println(lineCount);
		System.out.println(wordCount);
		System.out.println(charCount);
		
		
	  

	}

	
	
	
	

}

package JavaLearnings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTestFileExample {

	public static void main(String[] args) throws IOException {
		
		
		String[]fruits = {"Apple","Mango","Orange","Grapes","papaya","cherry"};
		String filePath = "C:\\Users\\002S4W744\\workspace\\Learnings\\Write.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		bw.write("This is written by java program.");
		for(String fruit :fruits)
		{
			bw.newLine();
			bw.write(fruit.toString());
			
		}
		bw.close();

	}

}

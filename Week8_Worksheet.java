

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;

public class Week8_Worksheet {
	public static void main(String[] args) {
		
		double number = 1.0/3.0;
		
		DecimalFormat number_format = new DecimalFormat("#.##");
		System.out.println(number);
		String formatted_string = number_format.format(number);
		System.out.println(formatted_string);
		
		double x = 123.456;
		double y = 17.0/3.0;
		double z = Math.sqrt(2);
		String a = "Hello";
		String b = "World";
		
		DecimalFormat newNumberFormat = new DecimalFormat("#.###");
		System.out.println(newNumberFormat.format(y));
		
		countDigitsInDouble(132.6521454);
		
		
		String c = new StringBuilder(a).reverse().toString()+" "+b;
		System.out.println(c);
		
		String d = c.replace("ll", "ppp");
		System.out.println(d);
		
		RoundingTest(10.2); 
		
		//The following snippet of code lists all of the files in a directory
		String dir_name = "C:\\Users\\danii"; //Or another directory
		File dir = new File(dir_name);
			
		File[] dir_list = dir.listFiles();
		for(int i=0;i<dir_list.length;++i){
			if(dir_list[i].isFile()) {
				System.out.println(dir_list[i].getName() + " [FILE]");
			}
			else if(dir_list[i].isDirectory()) {
				System.out.println(dir_list[i].getName()+ " [DIRECTORY]");
			}
			else {
				System.out.println(dir_list[i].getName() + " [OTHER]");
			}
			
		}
		
		System.out.println("-----------------------------------------");
		fileOrDirectory(".png", "C:\\Users\\danii\\Documents");
		
		
		//generating a random number
		Random rand = new Random();
		for(int i=0;i<10;++i)
		{
			System.out.println(rand.nextInt());
		}
		
		generateRandomIntInRange(-100,100);
		
		generateRandomDoubleInRange(1,0);
		
		try {
			System.out.println("Word Count: " + countWordsInFile("SampleWordCountText.txt"));
		} catch (IOException e) {
			System.out.println("Ooops...error! Check your file name.");
		}

		try {
			writeSqrtTable(5,"Test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//METHODS
	
	public static void countDigitsInDouble(double input) {
		DecimalFormat df = new DecimalFormat("#.#################################");
		
		String str = df.format(input);
		
		int dotIndex = str.indexOf(".");
		
		if(dotIndex == -1) {
			// no decimal point
			System.out.println("Before decimal: " + str.length());
	        System.out.println("After decimal: 0");
	        return;
		}
		
		int before = dotIndex;
		int after = str.length() - dotIndex -1;
		
		System.out.println("Before decimal: " + before);
	    System.out.println("After decimal: " + after);
		
	}
	
	private static void RoundingTest(double x) 
	{
		System.out.println(Math.round(x));
	}
	
	//method to see if items in the specified directory are either files or directories 
	//and filter files based on their file type 
	public static void fileOrDirectory(String fileType, String dirName) {
		File dir = new File(dirName);
		
		File[] dir_list = dir.listFiles();
		for(int i=0;i<dir_list.length;++i){
			if(dir_list[i].isFile()) {
				if(dir_list[i].getName().contains(fileType)) {
					System.out.println(dir_list[i].getName() + " [FILE]");
				}
			}
			else if(dir_list[i].isDirectory()) {
				System.out.println(dir_list[i].getName()+ " [DIRECTORY]");
			}
			else {
				System.out.println(dir_list[i].getName() + " [OTHER]");
			}
			
		}
	}
	
	//method to generate random numbers in range inclusive
	public static void generateRandomIntInRange(int min, int max) {
		Random rand = new Random();
		if(min>max) {
			System.out.println("(min, max)! min cannot be grater than max!");
			return;
		}
		for(int i=0; i<5; i++) {
			System.out.println(rand.nextInt((max - min) + 1) + min);
		}
	}
	
	public static void generateRandomDoubleInRange(int min, int max) {
		Random rand = new Random();
		if(min>max) {
			System.out.println("(min, max)! min cannot be grater than max!");
			return;
		}
		for(int i=0;i<5;i++) {
			System.out.println(rand.nextDouble((max - min) + 1) + min);
		}
	}
	
	//read and write methods (FILE HANDLING)
	
	public static int countWordsInFile(String filePath) throws IOException {
		int wordCount = 0;
		FileReader file = new FileReader(filePath);
		BufferedReader br = new BufferedReader(file);
		String currentLine;
		while((currentLine = br.readLine()) != null) {
			if(!currentLine.trim().isEmpty()) {
				// Trim leading/trailing spaces, split the line into words using any amount of whitespace (\\s+),
				// and add the number of words (the array length) to the total word count.
				wordCount += currentLine.trim().split("\\s+").length;

			}
		}
		br.close();
		file.close();
		return wordCount;
	}
	
	public static void writeSqrtTable(int n, String filename) throws IOException {
		FileWriter file = new FileWriter(filename + ".txt");
		BufferedWriter bw = new BufferedWriter(file);
		
		for(int i=1; i<=n; i++) {
			String line = i + ": " + Math.sqrt(i) + ": " + Math.sqrt(i) + ": " + Math.sqrt(i);
			file.write(line);
			bw.newLine();
		}
		
		bw.close();
		file.close();
	}
	
	
	

}

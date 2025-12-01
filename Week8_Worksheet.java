package Week9_Worksheet;

import java.io.File;
import java.text.DecimalFormat;

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
		String dir_name = "C:\\Users"; //Or another directory
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
	}

		
	
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

}

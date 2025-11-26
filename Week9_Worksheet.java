package Week9_Worksheet;

import java.util.Arrays;

public class Week9_Worksheet {

	public static void main(String[] args) {
		int[] temp = {13, 44, 16, 11};
		System.out.println(Arrays.toString(celsiusToFahrenheit(temp)));
		
		int[] tempWithNeg = {-13, -44, -16, 45, 66};
		System.out.println(Arrays.toString(celsiusToFahrenheitWithoutNegative(tempWithNeg)));
		
		String[] tempInString = {"13", "3", "34", "26"};
		System.out.println(Arrays.toString(celsiusToFahrenheitInString(tempInString)));
		
		String[] tempWithInvalid = {"13", "", "34", "xyz"};
		System.out.println(Arrays.toString(celsiusToFahrenheitWithValidation(tempWithInvalid)));

	}
	
	//Celsius to fahrenheit function
	public static double[] celsiusToFahrenheit(int[] celsius) {
		double[] fahrenheit = new double[celsius.length];
		
		for(int i=0; i < fahrenheit.length; i++) {
			fahrenheit[i] = celsius[i] * 9.0/5 + 32;
		}
		
		return fahrenheit;
	}
	
	public static double[] celsiusToFahrenheitWithoutNegative(int[] celsius) {
		double[] fahrenheit = new double[celsius.length];
		
		for(int i=0; i < fahrenheit.length; i++) {
			if (celsius[i] <= 0) {
				fahrenheit[i] = 0.0;
				
			}
			else{
				fahrenheit[i] = celsius[i] * 9.0/5 + 32;
			}
			
		}
		
		return fahrenheit;
	}
	
	public static double[] celsiusToFahrenheitInString(String[] celsius) {
		double[] fahrenheit = new double[celsius.length];
		int[] celsiusInInt = new int[celsius.length];
		for(int i=0; i < celsius.length; i++) {
			celsiusInInt[i] = Integer.parseInt(celsius[i]);
		}
		
		for(int i=0; i < fahrenheit.length; i++) {
			fahrenheit[i] = celsiusInInt[i] * 9.0/5 + 32;
		}
		
		return fahrenheit;
	}
	
	public static double[] celsiusToFahrenheitWithValidation(String[] celsius) {
	    double[] fahrenheit = new double[celsius.length];

	    for (int i = 0; i < celsius.length; i++) {
	        try {
	            int c = Integer.parseInt(celsius[i]); // empty string throws here
	            fahrenheit[i] = c * 9.0 / 5 + 32;
	        } catch (NumberFormatException e) {
	            fahrenheit[i] = 0.0;  // default for invalid or empty input
	        }
	    }

	    return fahrenheit;
	}

	
	
	
	

}

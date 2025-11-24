package Week9_Worksheet;

public class Week9_Worksheet {

	public static void main(String[] args) {
		int[] temp = {13, 44, 16, 11};
		celsiusToFahrenheit(temp);

	}
	
	//Celsius to fahrenheit function
	public static double[] celsiusToFahrenheit(int[] celsius) {
		double[] fahrenheit = new double[celsius.length];
		
		for(int i=0; i < fahrenheit.length; i++) {
			fahrenheit[i] = celsius[i] * 9/5 + 32;
		}
		
		return fahrenheit;
	}

}

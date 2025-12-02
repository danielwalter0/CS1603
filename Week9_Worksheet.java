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
		
		System.out.println(oddOrEven(8));
		
		System.out.println(reverseString("Bogdan"));
		
		System.out.println(isLeapYear(2500));
		
		System.out.println(daysInMonth(2,2024));

		System.out.println(daysAlive(3,2,2007,28,11,2025));
		
		displayFibonacciSequence(7);
		
		System.out.println(factorial(5));
		
		System.out.println(fib(7));
		
		System.out.println(countChar("abracadabra", 'a'));
		
		System.out.println(isPal("level"));
		
		System.out.println(mcCarthy(50));
	}
	
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
	
	public static boolean oddOrEven(int num) {
		if (num%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String reverseString(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	
	public static boolean isLeapYear(int input) {
		if(input % 4 == 0) {
			if(input % 100 == 0) {
				if(input % 400 != 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static int daysInMonth(int month, int year) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return isLeapYear(year) ? 29:28;
		default:
			throw new IllegalArgumentException("Invalid month :" + month);
		}
	}
	
	public static int daysAlive(int bDay, int bMonth, int bYear, int cDay, int cMonth, int cYear) {
		int daysAlive = 0;
		
		daysAlive += daysInMonth(bMonth, bYear) - bDay;
		
		for(int i = bMonth + 1; i <= 12; i++) {
			daysAlive += daysInMonth(i, bYear);
		}
		
		for(int i = bYear - 1; i < cYear; i++) {
			daysAlive += isLeapYear(i) ? 366:365;
		}
		
		for(int i = 1; i < cMonth; i++) {
			daysAlive += daysInMonth(i, cYear);
		}
		
		daysAlive += cDay;
		
		return daysAlive;
	}
	
	public static void displayFibonacciSequence(int n) {
		if (n > 0) {
		    int[] fibNums = new int[n];

		    fibNums[0] = 1;
		    if (n > 1) {
		        fibNums[1] = 1;
		    }

		    // Print first numbers
		    System.out.println(fibNums[0]);
		    if (n > 1) System.out.println(fibNums[1]);

		    // Generate the rest
		    for (int i = 2; i < n; i++) {
		        fibNums[i] = fibNums[i-1] + fibNums[i-2];
		        System.out.println(fibNums[i]);
		    }

		} else {
		    System.out.println("Error, enter a positive integer");
		}		
	}
	
	public static long factorial(int n) {
	    if (n < 0) {
	        throw new IllegalArgumentException("n must be >= 0");
	    }
	    if (n == 0 || n == 1) {
	        return 1;
	    }
	    return n * factorial(n - 1);
	}	
	
	public static int fib(int n) {
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	    return fib(n-1) + fib(n-2);
	}
	
	
	public static int countChar(String str, char ch) {
		// Base case: empty string
		if (str.length() == 0) {
		    return 0;
		}
		
		// Look at the first character
		int count = (str.charAt(0) == ch) ? 1 : 0;
		
		// Recurse on the rest of the string
		return count + countChar(str.substring(1), ch);
	}
	
	public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return isPal(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }

	public static int mcCarthy(int x) {
		if(x > 100) {
			return x - 10;
		}
		else {
			return mcCarthy(mcCarthy(x+11));
		}
		
	}

}

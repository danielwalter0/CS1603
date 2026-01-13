import java.util.ArrayList;

public class Week15_Mock {
	public static void main(String[] args) {
		System.out.println(JoulesToWattHours(67));
		System.out.println(Quadrant("-2", "-2"));
		ArrayList <String> celsius = new ArrayList<String>();
		celsius.add("");
		celsius.add("");
		celsius.add("");
			
		System.out.println(CToF(celsius));
	}
	
	public static double JoulesToWattHours (double j) {
	   if(j <= 0 ) {
		   return -1;
	   }
	   else if(j >1000000) {
		   return -2;
	   }
	   else {
		   return j/3600;
	   }
	}
	
	
	public static int Quadrant(String x, String y) {
		if(x == null || y == null || x.isBlank() || y.isBlank() || x.contains(" ") || y.contains(" ")) {
			return -1;
		}
		else {
			try {
				int xNum = Integer.parseInt(x);
				int yNum = Integer.parseInt(y);
				if(xNum==0 || yNum==0) {
					return -3;
				}
				else {
					if(xNum>0 && yNum>0) {
						return 1;
					}
					else if(xNum<0 && yNum>0) {
						return 2;
					}
					else if(xNum<0 && yNum<0) {
						return 3;
					}
					else{
						return 4;
					}
					
				}
			}
			catch(Exception e){
				return -2;
			}	
		}
		
	}
	
	public static ArrayList<Double> CToF(ArrayList<String> C) {
		ArrayList<Double> outputFahrenheit = new ArrayList<Double>();
		for(int i = 0; i < C.size(); i++) {
			if(C.get(i) == null || C.get(i).isEmpty()) {
				return null;
			}
		}
		try {
			for(int i=0;i<C.size();i++) {
				double temp = Double.parseDouble(C.get(i));
				double fahrVal = temp * 9/5 + 32;
				outputFahrenheit.add(fahrVal);
			}
			return outputFahrenheit;
		}catch(Exception e) {
			outputFahrenheit.clear();
			return outputFahrenheit;
		}
		
		
	}
	
	
}

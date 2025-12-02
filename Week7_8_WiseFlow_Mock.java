package Week9_Worksheet;

import java.util.ArrayList;

public class Week7_8_WiseFlow_Mock {

	public static void main(String[] args) {
	System.out.println(MakeSequence(5));
	System.out.println("-----------------------------------------------");
	System.out.println(CalculateGradeLetter("57","4"));
	System.out.println("-----------------------------------------------");
	System.out.println(PMT(50000,6,10));
	System.out.println("-----------------------------------------------");
	System.out.println(CalculateAngle(1,1,3));
	System.out.println("-----------------------------------------------");
	int[][] points = {{1,1},{8,2},{10,10}};
	ArrayList<Integer> output = PointInCircle(points);
	System.out.println(output);
	
	
	}
	
	public static void DoSomeCalculation(double a, double b, double c, double d) 
	{
		System.out.println((a+b)/(c+d));
	}
	
	public static String MakeSequence(int N) 
	{
		String result="";
		if(N<1) {
			System.out.println("");
			return result;
		}
		else {
			int repeat = N;
			for(int i=1; i<=N; i++) {
				result = result + String.valueOf(i).repeat(repeat);
				repeat--;
			}
			return result;
		} 
	}
	
	public static String CalculateGradeLetter(String strGrade, String strBonus)
	{
		if(strGrade == null || strBonus == null) {
			return "-1";
		}
		strGrade = strGrade.replaceAll(" ", "");
		strBonus = strBonus.replaceAll(" ", "");
		
		if(strGrade.equals("") || strBonus.equals("")) {
			return "-2";
		}
		double actGrade, actBonus;
		try {
			actGrade = Double.parseDouble(strGrade);
			actBonus = Double.parseDouble(strBonus);
		} catch (Exception e) {
			return "-3";
		}
		
	
		double finalGrade = actGrade + actBonus;
		
		
		if(finalGrade>=70) {
			return "A";
		}
		else if(finalGrade >=60) {
			return "B";
		}
		else if(finalGrade >=50) {
			return "C";
		}
		else if(finalGrade >=40) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	
	public static double CalculateExpression(double n, double x, double y, double z) 
	{
		return(7.2*n*(Math.pow(x, 2) + Math.pow(y, 2) +Math.pow(z, 2)));

	}
	
	
	public static double PMT (double P, double r, double n) 
	{
		r = r/100/12;
		n = n*12;
		
		return((P*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1));
	}
	
	public static double CalculateAngle (double a, double b, double c) 
	{
		
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			double cosA = ((Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c));
			cosA = Math.acos(cosA);
			cosA = Math.toDegrees(cosA);
			return cosA;
		}
		else {
			return -1.0;
		}
	 
	}
	
	public static ArrayList<Integer> PointInCircle(int[][] points) 
	{
		int h = 3;
		int k = 2;
		int r = 5;

		ArrayList<Integer> output = new ArrayList<Integer>();
		try {
			for(int i=0;i<points.length;i++) {
				int x=points[i][0];
				int y=points[i][1];
				
				if(Math.pow(x-h, 2)+Math.pow(y-k, 2) < Math.pow(r, 2)) {
					output.add(1);
				}
				else if(Math.pow(x-h, 2)+Math.pow(y-k, 2) == Math.pow(r, 2)) {
					output.add(2);
				}
				else if(Math.pow(x-h, 2)+Math.pow(y-k, 2) > Math.pow(r, 2)) {
					output.add(3);
				}
			}
		} catch (Exception e) {
			output.add(-1);
		}
		
		return output;
	}
	
	
}

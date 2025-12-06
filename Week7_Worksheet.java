import java.util.ArrayList;
import java.util.Arrays;

public class Week7_Worksheet {

	public static void main(String[] args) {
		Data fred = new Data("Fred", 41);
		Data susan = new Data("Susan", 23);
		Data zoe = new Data("Zoe", 37);
		fred.Print();
		
		
		ArrayList<Data> people = new ArrayList<Data>();
		people.add(fred);
		people.add(susan);
		people.add(zoe);
		
		
		PrintDataArray(people);
		people.forEach(x -> x.Print());
		
		System.out.println();
		
		//Casting - converting values when assigning them
		double x = 10;
		int y = (int) x;
		System.out.println(y);

		double price = 49.99;
		int discountedPrice = (int) price;
		System.out.println(discountedPrice); // value becomes 49

		char letter = 'A';
		int ascii = (int) letter;
		System.out.println(ascii);  //values becomes 65
		
		//to add an entity to an ArraList in a specific position use .add with an index
		people.add(2,new Data("Harry", 71));
		
		ArrayList<Data> ArrayA = new ArrayList<Data>();
		ArrayList<Data> ArrayB = new ArrayList<Data>();
		
		ArrayA.addAll(Arrays.asList(fred,susan,zoe));
		
		System.out.println("========================================");
		
		PrintDataArray(ArrayA);
		System.out.println();
		ArrayB = ArrayA;
		PrintDataArray(ArrayB);
		System.out.println();
		ArrayA.remove(1);
		PrintDataArray(ArrayB);
		
		ArrayList<Data> ArrayC = new ArrayList<Data>();
		ArrayList<Data> ArrayD = new ArrayList<Data>();
		
		ArrayC.addAll(Arrays.asList(fred,susan,zoe));
		
		System.out.println("========================================");
		
		PrintDataArray(ArrayC);
		System.out.println();
		// clone() creates a separate ArrayList but with the same object references, 
		// so removing from ArrayC does not affect ArrayD
		ArrayD = (ArrayList<Data>)ArrayC.clone(); 
		ArrayC.remove(1);
		PrintDataArray(ArrayC);
		System.out.println();
		PrintDataArray(ArrayD);
		System.out.println();

		

		
		
		
	}
	
	private static void Print2DArray(int[][] array) 
	{
		for(int i=0;i<array.length;++i)
		{
			for(int j=0;j<array[i].length;++j)
			{
				System.out.print(array[i][j] + " ");
			}
			
		}
		
	}

	private static void PrintDataArray(ArrayList<Data> array) 
	{
		for(Data e: array)
		{
			e.Print();
		}
		System.out.println();
	}

	
	
	
}

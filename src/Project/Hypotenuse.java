package Project;
import java.util.Scanner;

public class Hypotenuse {
	public static void main(String[] args) {
		
		//HYPOTENUSE c = Math.sqrt(a² + b²)
		
		Scanner s = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.print("Enter the length of side A: ");
		a = s.nextDouble();
		
		System.out.print("Enter the length of side B: ");
		b = s.nextDouble();
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("The hypotenuse (side c) is: "+ c+"cm");
		
		s.close();
	}
}

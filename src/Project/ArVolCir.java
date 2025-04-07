package Project;
import java.util.Scanner;

public class ArVolCir {
	public static void main(String[] args) {
	
		
		// CIRCUMFERENCE = 2 * Math.PI * radius
		// AREA = Math.PI * Math.pow(radius, 2)
		// VOLUME = (4.0/3.0) * Math.PI * Math.pow(radius, 3)
		
		Scanner s = new Scanner(System.in);
		
		double radius, circumference, area, volume;
		
		System.out.print("Enter the radius : ");
		radius = s.nextDouble();	
		
		circumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("The Circumference is : "+circumference+"cm");
		System.out.println("The Area is : "+area+"cm²");
		System.out.println("The Volume is : "+volume+"cm³");
		
		System.out.println("--------------------------------------------");
		
		System.out.printf("The Circumference is : %.2fcm\n", circumference);
		System.out.printf("The Area is : %.2fcm²\n", area);
		System.out.printf("The Volume is : %.2fcm³\n", volume);
		s.close();
	}
}

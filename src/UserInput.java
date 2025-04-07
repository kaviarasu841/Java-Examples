import java.util.Scanner;
public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		/*System.out.print("Enter your name: ");
		String name = s.nextLine();
		
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		
		System.out.print("Enter your gpa: ");
		double gpa = s.nextDouble();
		
		System.out.print("Are you a student? (true/false): ");
		boolean isStudent = s.nextBoolean();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("Your gpa is "+gpa);
		
		if(isStudent) System.out.println("You are enrolled as student");
		else System.out.println("You are not enrolled");*/
		
		/*--------------------------------------------------------------------------*/
		
		//calculate the Area of Rectangle
		
		double width = 0;
		double height = 0;
		double area = 0;
		
		System.out.print("Enter the Width: ");
		width = s.nextDouble();
		System.out.print("Enter the Height: ");
		height = s.nextDouble();
		
		area = width * height;
		System.out.println("The area is: "+area+"cm²");
		
		
		s.close();
		
	}

}

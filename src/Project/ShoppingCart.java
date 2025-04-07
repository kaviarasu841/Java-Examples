package Project;
import java.util.Scanner;

public class ShoppingCart {
	
	public static void main(String[] args) {
		
		//SHOPPING CART PROGRAM
		
		Scanner s = new Scanner(System.in);
		
		String item;
		double price;
		int quantity;
		char currency = '$';
		double total;
		
		System.out.print("What item would you like to buy?: ");
		item = s.nextLine();
		
		System.out.print("What is the price for each?: ");
		price = s.nextDouble();
		
		System.out.print("How many would you like?: ");
		quantity = s.nextInt();
		
		total = price * quantity;
		System.out.println("\nYou have bought "+quantity+" "+item+"/s");
		System.out.println("Your total is "+ currency+total);
		
		
		s.close();
	}

}

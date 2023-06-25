package aits;
import java.util.Scanner;

public class HelloClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("what is your name?");
	String name=scanner.nextLine();
	System.out.println("How old are you?");
	int age=scanner.nextInt();
	scanner.nextLine();
	System.out.println("What is favorite food?");
	String food=scanner.nextLine();
	
	System.out.println("Hello "+name);
	System.out.println("Your age "+age+" years old");
	System.out.println("You like "+food);
	System.out.println("what is your name?");
	String name=scanner.nextLine();
	System.out.println("How old are you?");
	int age=scanner.nextInt();
	scanner.nextLine();
	System.out.println("What is favorite food?");
	String food=scanner.nextLine();
	
	System.out.println("Hello "+name);
	System.out.println("Your age "+age+" years old");
	System.out.println("You like "+food);
	}

}

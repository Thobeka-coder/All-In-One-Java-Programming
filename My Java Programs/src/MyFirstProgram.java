import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {            //method
		System.out.println("What is your name?");       //output syntax
		
		Scanner scanner = new Scanner(System.in);       //input syntax
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);
		
	}

}




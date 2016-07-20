import java.util.Scanner;

public class CalciExample {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator!!!");
		System.out.println("Enter 1st Number - ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number - ");
		int b = sc.nextInt();
		
		System.out.println("Menu - Please enter your option number: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		int menu = sc.nextInt();
		
		switch(menu)
		{
		case 1: System.out.println("The Numbers are added : " + (a+b));break;
		case 2: System.out.println("The Numbers are added : " + (a-b));break;
		case 3: System.out.println("The Numbers are added : " + a*b);break;
		case 4: System.out.println("The Numbers are added : " + a/b);break;
		default: System.out.println("Sorry! Invalid Input!!!");
		}
		
	}

}

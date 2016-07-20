
import java.util.Scanner;

public class RandomGenerate {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the Range of Numbers..");
		System.out.println("Min Value..");
		int a = sc.nextInt();
		System.out.println("Max Value..");
		int b = sc.nextInt();
		
		GetMaxMinNumbers obj = new GetMaxMinNumbers(a, b);
	}

}

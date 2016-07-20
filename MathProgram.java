import java.util.Scanner;

public class MathProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter the value to find the Square Root and Cube Root : ");
		Scanner sc =new Scanner(System.in);
		double entervalue = sc.nextDouble();
		
		CallMath obj = new CallMath();
		obj.MathS(entervalue);

}
}

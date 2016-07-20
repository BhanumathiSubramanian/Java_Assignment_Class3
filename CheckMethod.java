import java.util.Scanner;

public class CheckMethod
	{
		private Scanner sc;

		public void getValue()
		{
			System.out.println("Enter a Number to Check: ");
			sc = new Scanner(System.in);
			int i = sc.nextInt();
			boolean check = true;
		    for (int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					check = false;
					//System.out.println("Its not a Prime");
					break;
				}
			}
			if(check)
				System.out.println("Its a Prime");
			else
				System.out.println("Its not a Prime"); 
		}
			}


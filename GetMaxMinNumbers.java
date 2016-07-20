import java.util.Random;

public class GetMaxMinNumbers {

	Random ran = new Random();
	public GetMaxMinNumbers(int min, int max)
	{
		for (int i=0 ; i<=max-1; i++)
		{
			
			System.out.println(ran.nextInt(((max-min)+1) + min));

		} 	
	}
	
}

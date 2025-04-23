
public class ConditionalStatements 
{
	public static void main(String[] args) 
	{
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100};
		
		//For loop with if else statement verifying array values if divisible or not by 2
		for (int i = 0; i < array1.length; i++) 
		{
			if (array1[i] % 2 == 0) 
			{
				System.out.println(array1[i] + " is divisible by 2");
				//break;
			}
			
			else 
			{
				System.out.println(array1[i] + " is NOT divisible by two");	
				//break;
			}
		}
	}
}

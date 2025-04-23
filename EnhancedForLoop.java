
public class EnhancedForLoop 
{
	public static void main(String[] args) 
	{
		double[] arr1 = new double[5];
		//int[] storing multiple integer values
		//arr variable name
		//new creates new memory for multiple values that will be stores
		
		arr1[0] = 10; //declaring values on each array
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50.5;
		
		int[] arr2 = {4, 8, 12, 16, 20, 24, 28, 32,36, 40}; //another way of storing values in an array
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		
		//For loop with array length equals to 5
		for (int i = 0; i < arr1.length; i++) 
		{
			System.out.println(arr1[i]);
		}
		
		//For loop with array length equals to 10
		for (int i = 0; i < arr2.length; i++) 
		{
			System.out.println(arr2[i]);
		}
		
		String[] namesCartoon = {"Spongebob", "Patrick", "Squidward", "Mr. Krabs"};
		
		for (int i = 0; i < namesCartoon.length; i++) 
		{
			System.out.println(namesCartoon[i]);
		}
		
		//Enhanced For Loop
		String[] namesGames = {"Jin", "Kazuya", "Heihachi", "Eddie"};
		
		for (String s : namesGames) 
		{
			System.out.println(s);
		}

	}
}

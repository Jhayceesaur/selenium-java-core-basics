import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateArrays 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Gengar");
		a.add("Scyther");
		a.add("Pikachu");
		a.add("Lapras");
		a.add("Snorlax");
		a.add("Alakazam");
		a.add("Voltorb");
		System.out.println(a.get(0));
		
		for (int i = 0; i < a.size(); i++) //Size if using ArrayList; Length is using Array only
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("----------------------------------------");
		
		for (String pokemon : a) 
		{
			System.out.println(pokemon);
			
		}
		
		System.out.println("*****************************************");
		
		//Check if item is present in ArrayList
		System.out.println(a.contains("Snorlax"));
		
		System.out.println("*****************************************");
		
		String[] colors = {"violet", "black", "blue", "yellow"};
		List <String> colorsArrayList = Arrays.asList(colors);
		System.out.println(colorsArrayList.contains("yellow"));


	}
}

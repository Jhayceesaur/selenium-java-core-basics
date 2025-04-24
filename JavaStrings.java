
public class JavaStrings 
{
	public static void main(String[] args) 
	{
		//String s and s1 will return the same value but s5 will be different (String literal)
		String s = "Scooby Doo";
		String s1 = "Scooby Doo";
		String s5 = "Shaggy";
		
		//String new -- s2 and s3 are 2 different and separate value
		String s2 = new String ("Selenium");
		String s3 = new String ("Selenium");
		
		//Split string's white spaces -- will split string into 3
		String s4 = "Hello Fellow Tester!";
		String[] splittedString = s4.split("Fellow");
		System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[2]);
		
		System.out.println("----------------------");
		
		//Print each character from string
		for (int i = 0; i < s4.length(); i++) 
		{
			System.out.println(s4.charAt(i));
		}
		
		System.out.println("----------------------");
		
		//Reverse print each character from string
		for (int i = s4.length()-1; i >= 0; i--) 
		{
			System.out.println(s4.charAt(i));
		}
	}
}

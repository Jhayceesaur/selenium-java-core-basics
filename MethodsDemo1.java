
public class MethodsDemo1
{
	public static void main(String[] args) 
	{
		//Main Block will always execute codes
		MethodsDemo1 d = new MethodsDemo1();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		String name1 = d1.getUserData();
		System.out.println(name1);
		String name2 = getData2();
		System.out.println(name2);
	}
	
	//This method will not execute
	public String getData() //public means can be used by other classes / void means does not return any
	{
		System.out.println("Hello world!");
		return "Bye guys!";
	}
	
	public static String getData2() //static can directly accessing a method without using an object
	{
		System.out.println("Welcome to my world!!");
		return "This is how it ends";
	}
}

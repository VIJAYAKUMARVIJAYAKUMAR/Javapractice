package Day1;

public class Shirt {

	public static void main(String[] args)
	{
		
		Shirt S= new Shirt();
		S.brandname();
		S.color();
		S.size();
		S.price();
		  
		System.out.println(S.name);
		
	}
	String name="otto shirt";
	public void brandname()
	{
		System.out.println("brandname");
	}
	public void color()
	{
		
	System.out.println("color");
	}
	public void size()
	{
		System.out.println("size");
		
	}
	public void price()
	{
		System.out.println("price");
	}
}
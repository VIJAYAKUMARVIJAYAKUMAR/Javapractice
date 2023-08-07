package javaproject;

public class Bus {

	public static void main(String[] args)
	{
		
		Bus b= new Bus();
		b.color();
		b.horn();
		b.tyre();

		  System.out.println(b.name);
		}
	String name="bus";
	
	public void color()
	
	{
		
	System.out.println("color");
	}
	public void horn()
	{
		System.out.println("horn");
		
	}
	public void tyre()
	{
		System.out.println("tyre");
	}

}


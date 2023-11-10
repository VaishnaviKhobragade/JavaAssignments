package Lab9;

public class ConstructorChaining extends demo1{
	ConstructorChaining()
	{
		
		System.out.println("Default cons");
	}
	ConstructorChaining(int a)
	{
		super(a);
		System.out.println("int parm demo1_1 cons");
	}
	ConstructorChaining(String a)
	{
		super(a);
		System.out.println("String parm demo1_1 cons");
	}
	  public static void main(String args[])
	    {
	        // invokes parameterized constructor 3
	        new ConstructorChaining(8);
	        new ConstructorChaining("Vaishnavi");
	    }
}

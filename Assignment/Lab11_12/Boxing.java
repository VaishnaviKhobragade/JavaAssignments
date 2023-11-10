package Lab11_12;

public class Boxing {
	static int a=10;
	static char c='a';
	static int b;
	static char cc;
	public static void main(String arr[])
	{
		Integer i=new Integer(a);
		System.out.println("Auto boxing int to Integer "+i);
		Character ch=new Character(c);
		System.out.println("Auto boxing char to Character "+ch);
		b=new Integer(20);
		System.out.println("Auto Unboxing Integer to int "+b);
		cc=new Character('b');
		System.out.println("Auto Unboxing Character to char "+cc);
	}
}

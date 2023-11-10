package Lab10;
import Lab9.*;
public class mle2 extends mle1 {
public void m1()
{
	System.out.println("child of mle1");
}
public static void main(String[] args)
{
	mle2 m=new mle2();
	m.m1();
	new mle1().m1();
	m.m3();
	
}
}

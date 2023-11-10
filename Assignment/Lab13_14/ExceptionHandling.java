package Lab13_14;

public class ExceptionHandling {
	void m1()
	{
		int a=10,b=0,c;
		try {
		c=a/b;
		System.out.println(c);}
		catch(Exception e)
		{
			System.out.println("Error");
			System.out.println(e);
		}
		finally {
			System.out.println("Executed .....");
		}
	}
		public void m2() throws Exception
		{
			int r=10,g=0,h;
//			if(g==0)
//			{
//				throw new Exception("Handel");
//			}
			h=r/g;
			System.out.println(h);
			System.out.println("Executed .....");
			
			
		}
		
	

	public static void main(String[] args) {
		ExceptionHandling EH=new ExceptionHandling();
		EH.m1();
		try {
		EH.m2();
		}catch(Exception e) {
			System.out.println("Handel the exception");
		}

	}

}

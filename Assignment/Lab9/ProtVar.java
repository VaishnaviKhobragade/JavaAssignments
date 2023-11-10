package Lab9;
import Lab9_1.ProtectedVar;
public class ProtVar extends ProtectedVar {
	public int a=20;
	 public static void main(String args[])
	    {
	    ProtectedVar pv=new ProtectedVar();
	    System.out.println("Protected variable:- "+pv.a);
	    System.out.println("Protected variable:- "+pv.s);
	    }
}

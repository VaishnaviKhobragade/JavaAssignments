package Lab9;

public class GarbageCollectionExample {
	void m1()
	{
		System.out.println("Default method m1");
	}
	void m2()
	{
		System.out.println("Default method m2");
	}
    public static void main(String[] args) {
    	
      //  Integer Obj = new Integer(5);  // create an object
    	GarbageCollectionExample ob=new GarbageCollectionExample();
    	ob.m1();
        ob = null;  // set the reference to null, indicating that the object is no longer needed
        System.gc();  // request that the garbage collector run
       // ob.m2();
    }
}

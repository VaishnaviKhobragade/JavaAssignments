package Lab13_14;

public class throwsKey {
	  public static void main(String[] args) {
	        try {
	            divide(10, 0); // call the divide method with an illegal argument
	        } catch (ArithmeticException e) {
	            System.err.println("Error: " + e.getMessage()); // handle the exception here
	        }
	    }

	    public static double divide(int a, int b) throws ArithmeticException {
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by 0"); // throw an exception if the argument is invalid
	        }

	        return (double) a / b;
	    }

}

package Lab11_12;


public class StringFunction {
 public static void main(String[]args) {
	 String s=new String();
	 s="Vaishnavi";
	 String s1="VAISHNAVI";
	 System.out.println("string:"+s.substring(4));
	 System.out.println(s.compareTo(s1));
	 System.out.println(s.toUpperCase());
	 System.out.println(s1.toLowerCase());
	 System.out.println(s.charAt(2));
	 System.out.println(s1.codePointAt(3));
	 System.out.println(s.codePointBefore(2));
	 System.out.println(s1.concat(s));
	 System.out.println(s.length());
	 System.out.println(s.indexOf(3));
	 System.out.println(s1.hashCode());
	
 }
}

package stringsprogram;
import java.util.*;
public class Stringbufferbuilder {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter");
//		String s=sc.nextLine();
//        StringBuffer s1=new StringBuffer(s);
//        s1.append(" world");
//        System.out.println(s1.capacity());
//        System.out.println(s1);
//        System.out.println(s1.insert(0,"Dharani "));
//        System.out.println(s1.replace(1, 3, "meow"));
//        System.out.println(s1.delete(0, 2));
//        System.out.println(s1.reverse());
//        System.out.println(s1.capacity());
//        s1.append("hello hi dhwe jhehd uegud");
//        System.out.println(s1.capacity());
	String s1="hello";
	c1(s1);
	System.out.println("String "+s1);
	StringBuilder s2=new StringBuilder();
    c2(s2);
    System.out.println("String "+s2);
    StringBuffer s3=new StringBuffer();
    c3(s3);
    System.out.println("String "+s3);
    String k="abc";
    String n="abc";
    System.out.println(k.compareTo(n));
    
	}
	public static void c1(String s1) {
		s1=s1+"Ram";
	}
	public static void c2(StringBuilder s2) {
		s2.append("hi");
	}
	public static void c3(StringBuffer s3) {
		s3.append("hello");
	}
	
}

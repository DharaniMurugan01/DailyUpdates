package stringsprogram;
import java.util.*;
public class Med2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yur first name");
		String first=sc.next();
		System.out.println("Enter your last name");
		String last=sc.next();
		StringBuilder s=new StringBuilder();
		System.out.println(s.append((first.substring(0,3))
				+last.substring(last.length()-3)
				+first.length()
				+last.length()));
		sc.close();
	}

}

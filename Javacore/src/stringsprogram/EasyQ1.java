package stringsprogram;

import java.util.*;

public class EasyQ1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			System.out.print((char)(c+2));
			
			
		}
	}
}

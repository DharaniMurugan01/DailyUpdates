package stringsprogram;
import java.util.*;
public class Med3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the string");
		int n=sc.nextInt();
		System.out.println("Enter the names ");
        String s[]=new String[n];
        for(int i=0;i<n;i++) {
        	s[i]=sc.next();
        }
        Arrays.sort(s,(a,b)->a.substring(0,3).compareTo(b.substring(0,3)));
        for(String a:s) {
        	System.out.println(a);
        }
	}
}

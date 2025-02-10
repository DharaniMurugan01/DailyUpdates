package stringsprogram;
import java.util.*;
public class EasyQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=sc.next().toUpperCase();
        char c[]=s.toCharArray();
        int count=0;
        HashSet<Character> s1=new HashSet<>();
        for(int i=0;i<c.length;i++) {
        	count=0;
        	for(int j=0;j<c.length;j++) {
        		if(c[i]==c[j]) {
        			count++;
        		}
        	}
        	System.out.println(c[i]+" count is "+count);
        }
	}

}

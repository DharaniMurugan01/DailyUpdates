package stringsprogram;
import java.util.*;
public class MedQ4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        
        for(int i=0;i<s.length()-1;i++) {
          char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        	  if(s.charAt(i+1)=='a'||s.charAt(i+1)=='e'||s.charAt(i+1)=='i'||s.charAt(i+1)=='o'||s.charAt(i+1)=='u') 
        		System.out.println(c+""+s.charAt(i+1)+" ");

	     }
  }
}

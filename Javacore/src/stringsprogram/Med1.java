package stringsprogram;
import java.util.*;
public class Med1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String m;
        String c[]=s.split(" ");
       for(int i=0;i<2;i++) {
    		   System.out.print(c[i]+" ");
       }
       System.out.println("\npls wait");
       for(int i=2;i<c.length;i++) {
    	   System.out.print(c[i]+" ");
       }
	}

}

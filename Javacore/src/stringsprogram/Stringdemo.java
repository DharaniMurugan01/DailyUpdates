package stringsprogram;
import java.util.*;
public class Stringdemo {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//length();
			String s="Dharani";
			System.out.println("\nlength is "+s.length());
			//concatination
			String s1="murugan";
			System.out.println(20+50+s+s1+" welcome "+s.concat(s1));
            System.out.println(s1+"\n"+s+"\n"+s1+s);
            System.out.println("------------");
            //substring
            String s2="Education";
            System.out.println(s2.substring(6));//string starts with 0 and it starts prints with 0 to end
            System.out.println(s2.substring(3,6));//starts with 3 ends with 5
            //upper lowercase
            System.out.println(s2.toUpperCase());
            System.out.println(s2.toLowerCase());
            System.out.println("------------");
            //trim
           String s3=" Enjoy your meal        ";
           System.out.println(s3.length()+"\n"+s3.trim().length()+"\n"+s3.length());
           System.out.println("------------");
           //start and ends with
           System.out.println(s3.startsWith("Enjoy"));
           System.out.println(s3.startsWith(" Enjoy"));
           String s4="hello everyone";
           System.out.println(s4.endsWith("everyone"));
           System.out.println(s4.endsWith("e"));
           System.out.println("------------");
           String s5="welcome";
           char c[]=s5.toCharArray();
           for(int i=0;i<s5.length();i++) {
        	   System.out.println(c[i]);
           }
           System.out.println("------------");
           //eqals or not 
           String s6="welcome";
           String s7="welcome";
           String s8=new String("welcome");
           System.out.println(s5.equals(s6));
           System.out.println(s5.equalsIgnoreCase(s6));
           System.out.println("------------");
           //it focus memory type
           System.out.println(s6==s7);
           System.out.println(s7==s8);
           System.out.println("------------");
           
		}
	}

package stringsprogram;
import java.util.*;
public class HardQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = sc.next();
        if (pwd.length() >= 6 && digits(pwd) == 1 && isLower(pwd)==1 && isspecial(pwd)==1) {  
            if(isUpper(pwd)==1) {  
            	System.out.println("Strong");
            }
            else {
            	System.out.println("Moderate");
            }
        }
        else if(pwd.length() >= 6 || digits(pwd) == 1 || isLower(pwd)==1 || isspecial(pwd)==1 || isUpper(pwd)==1){
        	System.out.println("Weak");
        }
        else {
        	System.out.println("provide a valid password");
        }
    }
    static int digits(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            char a = pwd.charAt(i);
            if (a >= '0' && a <= '9') {  
                return 1;
            }
        }
        return 0;
    }
    static int isLower(String pwd) {
    	for(int i=0;i<pwd.length();i++) {
    		char a=pwd.charAt(i);
    		if(a>='a'&&a<='z') {
    			return 1;
    		}
    	}
    	return 0;
    }
    static int isUpper(String pwd) {
    	for(int i=0;i<pwd.length();i++) {
    		char a=pwd.charAt(i);
    		if(a>='A'&&a<='Z') {
    			return 1;
    	   }
        }
    	return 0;
    }
    static int isspecial(String pwd) {
    	for(int i=0;i<pwd.length();i++) {
    		char a=pwd.charAt(i);
    		if(a=='!'||a=='@'||a=='#'||a=='$'||a=='%'||a=='^'||a=='&'||a=='*'||a=='('||a==')'||a=='-'||a=='+') {
    			return 1;
    		}
    	}
    	return 0;
   }
}
package stringsprogram;
import java.util.*;
public class HardQ1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.sender\n2.receiver\n3.Exit\nEnter your choice");
		int n=sc.nextInt();
		System.out.println("Enter the key");
		int key=sc.nextInt();
		if(n==1){
			System.out.println("Enter original text");
			sc.nextLine();
			String s1=sc.nextLine();
			char[] c=s1.toCharArray();
			for(int i=0;i<s1.length();i++) {
				if(c[i]!='z') {
				System.out.print((char)(c[i]-key));
				}
				else{
					System.out.println((char)('a'+key-1));
				}
			}
		}
		else if(n==2) {
			System.out.println("Enter original text");
			sc.nextLine();
			String s1=sc.nextLine();
			char[] c=s1.toCharArray();
			for(int i=0;i<s1.length();i++) {
				if(c[i]!='a') {
				System.out.print((char)(c[i]-key));
				}
				else {
					System.out.println((char)('z'-key+1));
				}
			}
		}
		else {
			System.out.println("Exit");
		}
     sc.close();
	}
}

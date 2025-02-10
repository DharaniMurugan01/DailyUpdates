package stringsprogram;
import java.util.*;
public class EasyQ3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] s=new String[size];
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();
		}
		Arrays.sort(s);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}

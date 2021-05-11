package student.java;
import java.util.Scanner;
public class Fifteen {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		while(n>0)
		{
			int k=n%10;
			s=s+k;
			n=n/10;
		}
		System.out.println(s);
	}

}

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,p;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		p=n;
		while(n>0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		if(p==sum)
			System.out.println("Given number is a palindrome");
		else
			System.out.println("Given number is not a palindrome");
		sc.close();

	}

}
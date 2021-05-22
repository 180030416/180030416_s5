package practise;
import java.util.Arrays;
import java.util.Scanner;
public class twentyone {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Min"+a[0]+"Max"+a[n-1]);

	}

}
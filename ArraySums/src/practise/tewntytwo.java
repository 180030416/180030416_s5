package practise;
import java.util.Scanner;
public class tewntytwo {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				System.out.println("Found at index"+i);
				c=1;
				break;
			}
			else
			{
				c=0;
			}
		}
		if(c==0)
		{
			System.out.println(-1);
		}
	}

}
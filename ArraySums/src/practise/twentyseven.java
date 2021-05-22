package practise;
import java.util.*;

public class twentyseven{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a[],sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of array elements is "+sum);
		sc.close();

	}

}
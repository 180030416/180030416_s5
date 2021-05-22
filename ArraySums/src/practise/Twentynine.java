package practise;

import java.util.Scanner;

public class Twentynine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0; i<n; i++)
	       {
	           for(int j=0; j<m; j++)
	           {
	               a[i][j] = sc.nextInt();
	           }
	       }
		int max=a[0][0];
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]>max)
                    max=a[i][j];
            System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println(" the maximum value is "+max);

	}

}
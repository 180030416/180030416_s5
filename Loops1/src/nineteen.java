

public class nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=1;i<1000 && c<5;i++)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.printf(i+" ");
				i+=29;
				c+=1;
			}
		}

	}

}
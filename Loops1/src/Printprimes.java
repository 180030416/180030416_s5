
import java.util.*;
public class Printprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		for(int num=10;num<100;num++)
		{
			flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.print(num + " ");
		}

	}

}
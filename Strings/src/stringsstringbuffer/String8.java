package stringsstringbuffer;

public class String8 {

	public static void main(String[] args) {
		String str = "ab*cd";
		
		String[] strs = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);

	}

}
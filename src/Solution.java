import java.util.Scanner;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int max = 0;
			int min = 1000000;
			while (st.hasMoreTokens()) {
				String tok = st.nextToken();
				int num = 0;
				for (int i = 0; i < tok.length(); i++) {
					num += tok.charAt(i) - '0';
				}
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			}
			
			System.out.println("#"+test_case+" "+max+" "+min);
		}	
	}
}
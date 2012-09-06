import java.util.Scanner;


public class p1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = in.nextInt();
		int sum=0;
		for(int i=1;i<max;i++)
			if(i%3==0 || i%5==0)
				sum+=i;
		System.out.println(sum);

	}

}

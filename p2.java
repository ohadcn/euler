

public class p2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO 
		long sum = 2;
		long f=1;
		long s=2;
		long c;
		do {
			c=f+s;
			if(c%2==0) {
				sum+=c;
				System.out.println(c);
			}
			f=s;
			s=c;
//			System.out.println(c);
		}while(c<4000000);

//		if(c%2==1 && c>4000000)
//			sum-=c;
		System.out.println(sum);
	}
}


public class p92 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a=new int[700];
		for(int i=1;i<700;i++) 
			test(a,i);
		int c=0;
		for(int i=2;i<10000000;i++)
			if(a[sqr(i)]==89)
				c++;
		System.out.println(c);
	}

	private static int test(int[] a, int i) {
		if(a[i]>0)
			return a[i];
		if(i==89) {
			a[i]=89;
			return 89;
		}
		if(i==1) {
			a[i]=1;
			return 1;
		}
		a[i]=test(a,sqr(i));
		return a[i];
	}

	private static int sqr(int i) {
		int s=0;
		do {
			s+=(i%10)*(i%10);
			i/=10;
		}while(i!=0);
		return s;
	}
}

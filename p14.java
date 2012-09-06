
public class p14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m=1000000;
		int[] n=new int[m];
		for(int i=0;i<m;i++)
			n[i]=0;
		int t=1;
		for(int i=2;i<m;i++)
			if(test(n,i)>n[t])
				t=i;
		System.out.println(t);

	}

	private static int test(int[] n, long i) {
		if(i==1)
			return 0;
		if(i>=1000000) {
			if(i%2==0)
				return test(n,i/2)+1;
			return test(n,3*i+1)+1;
		}
		if(n[(int) i]>0)
			return n[(int) i];
		if(i%2==0) {
			n[(int) i]=test(n,i/2)+1;
			return n[(int) i];
		}
		else {
			n[(int) i]=test(n,3*i+1)+1;
			return n[(int) i];
		}
			
	}

}

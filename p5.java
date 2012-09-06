
public class p5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] p= {2,3,5,7,11,13,17,19};
		int[] n=new int[p.length];
		for(int i=0;i<n.length;i++)
			n[i]=0;
		for(int i=2;i<20;i++)
			for(int j=0;j<p.length;j++)
				if(div(i,p[j])>n[j])
					n[j]=div(i,p[j]);
		int mul=1;
		for(int i=0;i<p.length;i++)
			for(int j=0;j<n[i];j++)
				mul*=p[i];
		System.out.println(mul);
	}

	private static int div(int num, int prime) {
		int i=-1;
		do {
			num/=prime;
			i++;
		}while(num>0);
			return i;
	}

}

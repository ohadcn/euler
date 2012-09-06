
public class p23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=28123;
		boolean[] a=new boolean[n];
		boolean[] b=new boolean[n];
		for(int i=1;i<n;i++) {
			int s=1;
			int l=(int)Math.sqrt(i);
			for(int j=2;j<=l;j++) {
				int d=i/j;
				if(d==i/(double)j) {
					s+=j;
					s+=(d==j?0:d);
				}
			}
			a[i-1]=i<s;
		}
//		for(int i=0;i<n;i++)
//			if(a[i])
//				System.out.print(i+1+" ");
		for(int i=0;i<n;i++)
			b[i]=false;
		for(int i=1;i<n;i++)
			for(int j=1;j<=i;j++)
				if(i+j<n && a[i-1] && a[j-1])
					b[i+j]=true;
		int s=0;
		for(int i=0;i<n;i++)
			if(!b[i])
				s+=i;
		System.out.println(s);
		
	}

}


public class p4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m=0;
		int p=0;
		for(int i=999;i>m;i--)
			for(int j=999;j>i;j--)
				if(isp(j*i)) {
					p=Math.max(i*j,p);
					m=p/1000;
				}
		System.out.println(p);
	}

	private static boolean isp(int n) {
		if(n%10!=n/100000)
			return false;
		if((n/10)%10!=(n/10000)%10)
			return false;
		if((n/100)%10!=(n/1000)%10)
			return false;
		return true;
	}
}

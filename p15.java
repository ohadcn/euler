
public class p15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=20;
		long[][] a=new long[n][];
		for(int i=0;i<n;i++)
			a[i]=new long[n];
		for(int i=0;i<n;i++) {
			a[i][0]=i+2;
			a[0][i]=a[i][0];
		}
		for(int i=1;i<n;i++)
			for(int j=1;j<=i;j++) {
				a[i][j]=a[i-1][j]+a[i][j-1];
				a[j][i]=a[i][j];
			}
		System.out.println(a[n-1][n-1]);
	}
}

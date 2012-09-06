
public class p376 {

	private static final int N=31;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a=new int[3][];
		for(int i=0;i<3;i++)
			a[i]=new int[6];
		for(int i=0;i<3;i++)
			for(int j=0;j<6;j++)
				a[i][j]=0;
		System.out.println(test(a,0)/6);
	}

	private static int test(int[][] t, int i) {
//		System.out.println(i);
		int co=0;
		for(int a=1;a<N;a++) {
			t[i][0]=a;
			for(int b=a;b<N;) {
				t[i][1]=b;
				for(int c=b;c<N;c++) {
					t[i][2]=c;
					for(int d=c;d<N;d++) {
						t[i][3]=d;
						for(int e=d;e<N;e++) {
							t[i][4]=e;
							for(int f=e;f<N;f++) {
								t[i][5]=f;
								if(i<2)
									co+=test(t,i+1);
								else
									co+=turn(t);
							}
						}
					}
				}
			}
		}
		return co;
	}

	private static int turn(int[][] a) {
		for(int i=0;i<3;i++)
			if(chance(a[i],a[(i+2)%3])<=.5 && chance(a[i],a[(i+1)%3])<=.5)
				return 0;
		return 1;
	}
	private static double chance(int[] a,int[] b) {
		int wi=0;
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				if(a[i]>b[j])
					wi++;
		return wi/36.0;
	}
}

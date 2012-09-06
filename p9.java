
public class p9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<300;i++)
			for(int j=i;j<500;j++)
				if(Math.sqrt(i*i+j*j)==1000-i-j) {
					System.out.println(i+" "+j+" "+(1000-i-j)+" "+i*j*(1000-i-j));
					System.exit(0);
				}

	}

}

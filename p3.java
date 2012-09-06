
public class p3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long num=600851475143L;
		long max = (long) Math.sqrt(num);
		if(max%2==0)
			max--;
		for(;max>0;max-=2)
			if(num%max==0) {
				boolean p = true;
				long s=(long) Math.sqrt(max);
				if(s%2==0)
					s--;
				for(;s>2;s-=2)
					if(max%s==0) {
						p=false;
						break;
					}
				if(p) {
					System.out.println(max);
					System.exit(0);
				}
			}
	}

}

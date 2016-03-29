package gc;

public class TestAllocation {
	
	private static final int _1MB = 1024 *1024;

	public static void main(String[] args) {
		/**
		 * VM ²ÎÊý£º-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
		 */
		byte[] a,b,c,d;
		a = new byte[2*_1MB];
		b = new byte[2*_1MB];
		c = new byte[2*_1MB];
		d = new byte[4*_1MB];
	}

}

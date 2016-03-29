package gc;

public class TestTenuringThreshold {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) {
		/**
		 * VM ²ÎÊý£º-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParNewGC -XX:MaxTenuringThreshold=1 
		 */
		byte[] a ,b,c;
		a = new byte[_1MB/4];
		b = new byte[4*_1MB];
		c = new byte[4*_1MB];
		c = null;
		c = new byte[4*_1MB];

	}

}

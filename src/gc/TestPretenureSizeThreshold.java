package gc;

public class TestPretenureSizeThreshold {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) {
		/**
		 * VM ²ÎÊý£º-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParNewGC -XX:PretenureSizeThreshold=3145728 
		 */
		byte[] a = new byte[4*_1MB];
		

	}

}

package gc;

public class TestTenuringThreshold2 {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) {
		/**
		 * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParNewGC -XX:MaxTenuringThreshold=15 
		 */
		byte[] a ,b,c,d;
		a = new byte[_1MB/4];
		b = new byte[_1MB/4];
		//a+b等于512K，大于Survivor空间的一半
		c = new byte[4*_1MB];
		d = new byte[4*_1MB];
		d = null;
		d = new byte[4*_1MB];

	}

}

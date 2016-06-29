package gc;

/**
 * 
 * 长期存活的对象进入老年代
 * 
 * @author linwn@ucweb.com
 * @createDate 2016-6-16
 *
 */
public class TestTenuringThreshold {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) {
		/**
		 * VM 参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParNewGC -XX:MaxTenuringThreshold=1 
		 */
		byte[] a ,b,c;
		a = new byte[_1MB/4];
		b = new byte[4*_1MB];
		c = new byte[4*_1MB];
		//---注释掉以下代码以便观察，注释掉只会进行1次回收，a还在survior的from区
		//没注释掉因为c分配时，进行2次回收，对象年龄达到超过1次，a被回收到tenured区，
		//新的c分配在eden,旧的c回收,b也移入tenured区
		c = null;
		c = new byte[4*_1MB];

	}

}

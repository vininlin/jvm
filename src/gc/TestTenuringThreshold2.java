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
		//触发回收eden区，a,b移入survior from区，c直接进入tenured区
		//然后的eden区给d分配
		d = new byte[4*_1MB];
		//------注释以下内容观察
		d = null;
		//触发第2次回收，d没有引用的实例，堆上的d引用的数据直接被回收掉
		//新的d分配在eden区
		//当Survivor空间的相同年龄的所有对象的大小总和等于Survivor空间的一半时，也会进行GC；
		d = new byte[4*_1MB];

	}

}

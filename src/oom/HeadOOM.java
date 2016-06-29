package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * VMArgs -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:\jvmdump\HeadOOM.bin
 * @author weining
 *
 */
public class HeadOOM {

	static class OOMObject{
		private byte[] bytes = new byte[1024];
	}
	
	public static void main(String[] args){
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}

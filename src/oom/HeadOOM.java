package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * VMArgs -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=e:\java\dump
 * @author weining
 *
 */
public class HeadOOM {

	static class OOMObject{
		
	}
	
	public static void main(String[] args){
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}

package oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.*;

import net.sf.cglib.proxy.MethodInterceptor;

/**
 * VM Args:-XX:PermSize=10M -XX:MaxPermSize=10m 
 * @author weining
 *
 */
public class JavaMethodAreaOOM {

	public static void main(String[] args) {
		
		while(true){
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor(){
				
				@Override
				public Object intercept(Object obj, Method method,
						Object[] args, MethodProxy proxy) throws Throwable {
					return proxy.invokeSuper(obj, args);
				}
			});
			enhancer.create();
		}

	}
	
	static class OOMObject{
		
	}

}

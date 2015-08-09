package gc;

public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK = null;
	
	public void isAlive(){
		System.out.println("yes ,i am still alive.");
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method execute");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}



	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();
		//对象第一次成功拯救自己
		SAVE_HOOK = null;
		System.gc();
		//暂停0.5秒等待finalize方法执行
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("i am die");
		}
		
		//同样的代码，第二次被回收
		SAVE_HOOK = null;
		System.gc();
		//暂停0.5秒等待finalize方法执行
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("i am die");
		}
		

	}

}

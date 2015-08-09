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
		//�����һ�γɹ������Լ�
		SAVE_HOOK = null;
		System.gc();
		//��ͣ0.5��ȴ�finalize����ִ��
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("i am die");
		}
		
		//ͬ���Ĵ��룬�ڶ��α�����
		SAVE_HOOK = null;
		System.gc();
		//��ͣ0.5��ȴ�finalize����ִ��
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("i am die");
		}
		

	}

}

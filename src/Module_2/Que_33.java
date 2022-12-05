package Module_2;

public class Que_33 extends Thread{
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		Que_33 t1=new Que_33();  
		t1.start();  
		}  
}

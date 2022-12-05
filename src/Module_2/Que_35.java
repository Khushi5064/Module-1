package Module_2;

public class Que_35 extends Thread {
	public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
		  Que_35 t1=new Que_35();  
		  t1.start();  
		  t1.start();  
		 }  
}

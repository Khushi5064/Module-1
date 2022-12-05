package Module_2;

public class Que_37 extends Thread{
	public Que_37(String name){
        super(name);
    }
  
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
          
        else
        {
            System.out.println(getName() + " is User thread");
        }
    }
	public static void main(String[] args)
    {
      
    	Que_37 t1 = new Que_37("t1");
    	Que_37 t2 = new Que_37("t2");
    	Que_37 t3 = new Que_37("t3");
      
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();        
    }
}

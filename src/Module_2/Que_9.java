package Module_2;

public class Que_9 {
	public static void main(String args[]) {
		Que_9 obj = new Que_9();
        obj.Printn(10, 'A');
        obj.Printn('B', 5);
	}
	void Printn(int a , char c){  
        System.out.println("Integer is: "+a);
        System.out.println("Char is: "+c);
    }    
    void Printn(char c,int a ){
        System.out.println("Char is: "+c);
        System.out.println("Integer is: "+a);
    }
}
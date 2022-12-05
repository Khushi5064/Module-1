package Module_2;

public class Que_8 {
	public static void main(String[] args) {
		Que_8 obj = new Que_8();

        obj.printn(5);

        obj.printn(5.5);

        obj.printn("123");

        obj.printn('A');

        obj.printn(10.444);

    }

    void printn(int a){

        System.out.println("Integer: " +a);

    }

    void printn(float a){

        System.out.println("float: " +a);

    }

    void printn(String a){

        System.out.println("String: " +a);   

    }

    void printn(char a){

        System.out.println("Char: " +a);

    }

    void printn(double a){

        System.out.println("Double: " +a);

    

    }
}

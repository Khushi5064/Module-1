package Module_2;

public class Que_30 {
	public static void main(String[] args) {
		try {
            for (int i = 0; i < 5; i++) {
               
                Thread.sleep(2000);
               
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
	}
}

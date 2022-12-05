package Module_2;

public class Que_29 {
	public static void main(String[] args) {
		try
        {
              int age=Integer.parseInt(args[0]);
              if(age<16)
                    throw new ArithmeticException("Invalid Age Exception");
              else
                    System.out.println("Welcome To The Group Of Votes");
        }
        catch(Exception e)
        {
              System.out.println(e);
        }
        System.out.println("not valid");
	}
}

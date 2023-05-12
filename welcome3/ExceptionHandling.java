package welcome3;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String s="abc";  
		int i=Integer.parseInt(s);//NumberFormatException  
	}
		catch(Exception e) {
			System.out.println("cannot convert to interger");
		}
	}

}

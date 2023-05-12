package welcome3;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  
        {  
        int i=5/0; //may throw exception   
        }  
             // handling the exception  
        catch(Exception e)  
        {  
                  // displaying the custom message  
            System.out.println("Can't divided by zero");  
        }  
	}

}

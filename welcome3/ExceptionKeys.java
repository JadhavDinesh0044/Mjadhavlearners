package welcome3;
class MyCustomException extends Exception  
{  
    
}  

public class ExceptionKeys {
	static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }  
	public static void main(String[] args) {
		 try  
	        {  
	            method();  
	        }  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println("caught in main() method");  
	        }  
		 finally {
			 System.out.println("hello");
			 }
		
		try  
        {  
            // throw an object of user defined exception  
            throw new MyCustomException();  
        }  
        catch (MyCustomException ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println(ex.getMessage());  
        }  
  
        System.out.println("rest of the code...");   
        
	}

}

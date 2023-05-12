package welcome3;

import java.io.*;
import java.util.Scanner;

public class Crudfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
            // Creating the file  
            File f0 = new File("E:foperations.txt");   
            if (f0.createNewFile()) {  
                       System.out.println("File " + f0.getName() + " is created successfully.");  
            } else {  
                       System.out.println("File is already exist in the directory.");  
            }  
          } catch (IOException exception) {  
                   System.out.println("An unexpected error is occurred.");  
                   exception.printStackTrace();  
       } 
		//writing into the file
		try {  
	        FileWriter fwrite = new FileWriter("E:foperations.txt");  
	        // writing the content into the FileOperationExample.txt file  
	        fwrite.write("Hi Jadhav Dinesh,how are you!!");   
	   
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Content is successfully wrote to the file.");  
	    } catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        //reading  the data 
	       try { 
	    	   File f0= new File("E:foperations.txt");    
            Scanner dataReader = new Scanner(f0);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch ( Exception e1) {  
            System.out.println("Unexcpected error occurred!");  
            e1.printStackTrace();  
        }  
	       File f0 = new File("E:foperations.txt");   
	       if (f0.delete()) {   
	         System.out.println(f0.getName()+ " file is deleted successfully.");  
	       } else {  
	         System.out.println("Unexpected error found in deletion of the file.");  
	       }   
			 
	}

}}

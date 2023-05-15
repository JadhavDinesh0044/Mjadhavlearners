package welcome;
//creating parameterized constructor
class Empl{
	int id;
	String name;
	Empl(int i,String s){
		id=i;
		name=s;
	}
	void display() {
		System.out.println(id +"  "+name);
	}
}

public class Phase1Ap4 {
	//default constructor
           Phase1Ap4()
           {System.out.println("hello god");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling a default constructor by creating object
		Phase1Ap4 obj=new Phase1Ap4();
		//calling parameterized constructor
		Empl ob=new Empl(1,"dinesh");
		ob.display();
		
		
		

	}

}

package welcome;
class inner{ //outer class
	int a=5;
	class outer{ //inner class
		int b=10;
	}
}

public class Phase1Ap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inner obje=new inner();
		inner.outer obj=obje.new outer();
		//accsing data form outer class with innerclass
		System.out.println(obje.a + obj.b);

	}

}

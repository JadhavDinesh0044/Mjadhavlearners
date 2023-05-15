package welcome;

public class Phase1Ap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Implicit type casting,done by system automatically
		int ab=3;
		System.out.println("Before casting "+ab);
		float yz=ab;
		System.out.println("after casting "+yz);
		// Explicit type casting,done by user
		double d=132.23;
		System.out.println("showing d value before casting:" +d);
		int i=(int)d;
		System.out.println("after casting:" +i);
	}

}

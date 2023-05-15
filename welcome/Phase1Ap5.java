package welcome;
import java.util.*;
//example of collection interface using arraylist

public class Phase1Ap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("dinesh");
		al.add("jadhav");
		al.add("pendyala");
		al.add("prem");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

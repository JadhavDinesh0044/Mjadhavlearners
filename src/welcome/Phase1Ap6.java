package welcome;
import java.util.*; //Collections using map interface

public class Phase1Ap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"Dinesh");
		mp.put(2,"Jadhav");
		mp.put(3, "prem");
		Set s=mp.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}

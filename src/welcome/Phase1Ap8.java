package welcome;

public class Phase1Ap8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="jadhav";//String is Immutable,whereas stringbuffer and builder are mutable with some changes in methods of strings
   StringBuffer sbf=new StringBuffer(s);
   sbf.reverse();
   System.out.println(sbf);
   StringBuilder sb=new StringBuilder(s);
   sb.append("dinesh");
   System.out.println(sb);
	}

}

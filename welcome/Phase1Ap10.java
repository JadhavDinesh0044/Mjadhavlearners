package welcome;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phase1Ap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		System.out.println(b);
		//another way
		boolean l=Pattern.matches("hi", "h");
		System.out.println(l);

	}

}

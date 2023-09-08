import static java.lang.System.*;
public class Madhu {

	public static void main(String[] args) {
		String s1= new String("Ashok");
		String s2= new String("Ashok");
		Integer I = new Integer(100);
		Integer I1 = new Integer(10);
		System.out.println(I.hashCode());
		System.out.println(I1.hashCode());
		System.out.println(I.hashCode() ==I1.hashCode());
		if(s1.hashCode()==s2.hashCode())
		{
			out.println("true");
			System.out.println(s1);
		}
		else
		{
			out.println("false");
		}

	}

}

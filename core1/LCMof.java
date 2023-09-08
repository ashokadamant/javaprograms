import java.util.Scanner;
public class LCMof {
	public static void main(StringDemo1 [] args)
	{
		int n1=72;
		int n2=120;
		int lcm;
		
		lcm=(n1>n2) ? n1:n2;
		while(true)
		{ 

			if(lcm % n1==0 && lcm % n2==0)
			{
				System.out.println(n1);
				System.out.println(n2);
				System.out.println(lcm);
				break;
			}
			++lcm;
			//System.out.println(lcm++);
		}
	}

}

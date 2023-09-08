import java.util.Scanner;
public class Multiplication {
	public static void main(StringDemo1[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number is ");
		int n=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			//int number =x*i;
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}

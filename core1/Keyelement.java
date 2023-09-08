import java.util.Scanner;
public class Keyelement {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int[10];
			int n,i,keyelement,flag=0;
			System.out.println("enter the size of array a");
			n=sc.nextInt();
			System.out.println("enter the array of elements");
			System.out.println("enter keyelement which you want to search");
			keyelement=sc.nextInt();
			for(i=0; i<n; i++) {
				if(a[i]==keyelement)
				{
				flag=1;
					break;
				}
				}
		if(flag==1) {
				
			System.out.println("search is successfully"+keyelement+"is founded"+i);
		}
		else {
	System.out.println("search is successfully");

			}

	}

}





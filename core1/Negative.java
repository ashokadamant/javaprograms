import java.util.Scanner;
public class Negative {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i=0,psum=0, nsum=0;
		System.out.println("enter the size of array a");
		n=sc.nextInt();
		System.out.println("enter the array of elements");
		a[i]=sc.nextInt();
		for(i=0; i<n; i++)
			if(a[i]>0)
				psum=psum+a[i];
			else
			{
				nsum=nsum+a[i];
			}
		System.out.println("sum of positive numbers of given array"+psum);
		System.out.println("sum of negative numbers of given array"+nsum);
	}

}

 import java.util.Scanner;
 class IfDemo4
 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the 1st person name");
		 String name1 = sc.next();
		 System.out.println("enter the age:");
		 int age1 = sc.nextInt();
		 System.out.println("enter the 2nd person name");
		 String name2 = sc.next();
		System.out.println("enter the age:");
		 int age2 = sc.nextInt();
		 if(age1>age2)
		 {
			 System.out.println(name1+"is elder than" +name2);
		 }
		 else 
		 {
			 System.out.println(name1+"  "+ "younger then"+"  " +name2);
		 }
	 }
 }
	

				 	


						
						
	

	
	

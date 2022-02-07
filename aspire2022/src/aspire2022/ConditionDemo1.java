package aspire2022;

import java.util.Scanner;

public class ConditionDemo1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number..:");
		int num=scan.nextInt();
		int val=num%2;
		
		//Ternary operator
		
		// ?
		boolean boo=(val==0);
		
	String 	result= boo ? "Even number..":"Odd Number...";
	
	System.out.println(result);
	
	System.out.println((num%2==0)?"Even num....":"Odd num...");
	
	
	}
}

package aspire2022;

public class Looping {
public static void main(String[] args) {
//	while(true) {// pre condition check
//		System.out.println("infinit looppp");
//	}
	
//	do {
//		System.out.println("infinite do while loop");
//	}while(true);// post condition check
	
	int i=10;
	while(i>0) {
		System.out.println("the value of i is...:"+i);
		i--;
	}
	
//	do {
//		System.out.println("loop is still executed....");
//	}while(i>10);
	
	do {
		System.out.println("do while i value is...:"+i);
		i++;
	}while(i<10);
}
}

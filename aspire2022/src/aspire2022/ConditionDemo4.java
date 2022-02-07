package aspire2022;

public class ConditionDemo4 {
	public static void main(String[] args) {
		//switch case works on a value
		
		int marks=40;
		
		switch(marks) {
		default:{
			System.out.println("no comments...");
			break;
		}
		case 40:{
			System.out.println("just pass...");
			break;
		}
		case 60:{
			System.out.println("first class");
			break;
		}
		case 70:{
			System.out.println("Good marks...");
			//break;
		}
		
		}
		System.out.println("called...");
		
		int n=10;
		
		switch(n%2) {
		case 1:{
			System.out.println("Odd number...");
			}
		case 0:{
			System.out.println("Even Numer...");
		}
		}
		
		char c='b';
		
		switch(c){
		case 'a':{
			System.out.println("a for apple...");
			break;
		}
		case 'b':{
			System.out.println("b for ball");
			break;
		}
		}
		
		String str="feb";
		
		switch(str) {
		case "jan":{
			System.out.println("January mont...");
			break;
		}
		case "feb":{
			System.out.println("february month...");
		}
		}
	}
}

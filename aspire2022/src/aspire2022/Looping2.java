package aspire2022;

public class Looping2 {
	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("infinite loop");
//		}
		
		for(int i=10;i>0;i--) {
			System.out.println("the loop executes...:"+i);
		}
		int count=0;
		//NESTED FOR LOOPS
		for(int i=0;i<5;i++) {//this loop will run 5 times
			for(int j=0;j<5;j++) {//this loop will run 5 X 5 times
				System.out.print("*    "+(++count));
			}
			System.out.println();
		}
	}
}

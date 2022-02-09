package aspire2022;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		//Enhanced for loop  or new for loop
		for(int i:arr) {
			System.out.println(i);
		}
		
		int twod[][]= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};
		
		for(int i[]:twod) {//row by row it will return
			for(int j:i) {//values of eachrow
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}

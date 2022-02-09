package aspire2022;

public class LoopingArrays {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int twod[][]= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};
		
		for(int i=0;i<twod.length;i++) {//this loop will run based on number of rows
			for(int j=0;j<twod[i].length;j++) {//this loop will run based on number of cols in particular row
				System.out.print(twod[i][j]+"\t\t");
			}
			System.out.println();
		}
	}
}

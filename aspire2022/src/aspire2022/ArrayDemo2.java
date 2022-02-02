package aspire2022;
//TWO DIMENSIONAL ARRAY
public class ArrayDemo2 {
	public static void main(String[] args) {
		int twod[][]= {
				{34,56,78,90},
				{12,23,34,45},
				{1,2,3,4,}
		};
		
		System.out.println(twod[0][0]);
		
		System.out.println(twod[2][3]);
		
		System.out.println(twod.length);// no of rows
		
		//Remember in two dimensional array - the length return number of rows
		
		System.out.println(twod[0].length);//this will return number of columns of zeroth row
		
		twod[0][0]=10010;
		
		System.out.println(twod[0][0]);
		
		System.out.println(twod[2][3]);
		
		int twodd[][]=new int[3][4];//3 rows and 4 columns
		
		System.out.println(twodd[0][0]);
		
		System.out.println(twodd[2][3]);
		
		twodd[0][0]=999999;
		
		System.out.println(twodd[0][0]);
		
		System.out.println(twodd[2][3]);
		
	}
}

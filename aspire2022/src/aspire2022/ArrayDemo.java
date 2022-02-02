package aspire2022;
//SINGLE DIMENSIONAL ARRAY
public class ArrayDemo {
	public static void main(String[] args) {
		int []arr= {12,34,2,34,45};//direct initialization of an array
		
		System.out.println(arr.length);
		
		System.out.println(arr[0]);//first value
		
		System.out.println(arr[4]);
		
		System.out.println(arr[arr.length-1]);
		
		//System.out.println(arr[5]);//throws ArrayIndexOutOfBoundsException
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		arr[0]=3000;
		arr[1]=4000;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		//we are now going to declare an empty array
		int arr2[]=new int[3];// by default zero will be assigned
		//the number in the right side indicates the number of columns
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		arr2[0]=3000000;
		arr2[1]=4000000;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
	}
}

package ch6;
//METHOD OVERLOADING - https://fluvid.com/videos/detail/R_4m9Svd-yiMPjj-_#.YgxfmXbCSnY.link
public class ClassDemo2 {
	public static void main(String[] args) {
		ClassDemo2 obj=new ClassDemo2();
		
		obj.met();
		
		obj.met(2);
		
		obj.met((long)100);
		
		obj.met2(10,"aspire");
		
		obj.met3(false);
		
		int arr[]= {34,76,98,76};
		
		obj.met4(arr);
		obj.met4(new int[] {10,20,30,40});//anonymous array
		
		obj.met5(12,45,67,89);
	}
	void met() {
		System.out.println("met called..");
	}
	
	void met(int i) {
		System.out.println("met with int param called..");
	}
	
	void met(long i) {
		System.out.println("met with long param called..");
	}
	
	void met2(int i,String n) {
		System.out.println("......................");
	}
	
	void met3(boolean boo) {
		System.out.println("booooooooooooooooooooooooooooooo");
	}
	
	void met4(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.print(i+"\t");
		}
	}
	
	void met5(int... aa) {//var args - PERIOD SYMBOL
		for(int i=0;i<aa.length;i++) {
			System.out.println(aa[i]);
		}
		
		for(int i:aa) {
			System.out.print(i+"\t");
		}
	}
}

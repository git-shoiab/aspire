package revision;
//https://fluvid.com/videos/detail/QKZX3hdAq9tRL_xPQ#.YjfcQe2-gNQ.link
public class ClassDemo3 {
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		System.out.println("Before Passing..:"+a[0]);
		//solution1 - anonymous array
		//new PassArray().acceptArray(new int[] {10,20,30});//anonymous array
		//solution2 - create a copy and send
		int copya[]=new int[4];
//		for(int i=0;i<a.length;i++) {
//			copya[i]=a[i];
//		}
		System.arraycopy(a,0,copya,0,a.length);
		new PassArray().acceptArray(a);
		System.out.println("After Passing...:"+a[0]);
	}
}

class PassArray{
	public void acceptArray(int a[]) {
		a[0]=9999;
	}
}
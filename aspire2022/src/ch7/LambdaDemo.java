package ch7;
//https://fluvid.com/videos/detail/ZEn3MT8GDpF9DqKgQ#.YjqKWdTRoas.link
public class LambdaDemo {
	public static void main(String[] args) {
		//Nested inner class
		new LambdaDemo().new MyInterImpl().met();
		
		//anonymous inner class
		new MyInter() {			
			@Override
			public void met() {
				System.out.println("met method called...");
			}
		}.met();
		
		//Lambda
		MyInter myi=()->{System.out.println("met called via lambda...");};
		
		myi.met();
		
		MyInter2 my2=(s,i)->{System.out.println("met of param called.."+s+":"+i);};
		my2.met("aspire",100);
		
	}
	
	class MyInterImpl implements MyInter{
		@Override
		public void met() {
			System.out.println("met called via inner class");
		}
	}
}
//functional interface - an interface with only one method is called functional interface
interface MyInter{
	public void met();
	//public void met2();
}

interface MyInter2{
	public void met(String s,int i);
}


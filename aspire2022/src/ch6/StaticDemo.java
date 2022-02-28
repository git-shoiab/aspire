package ch6;
//https://fluvid.com/videos/detail/n8QdniK9R6UXBangV#.YhwwhfqsWD8.link
public class StaticDemo {
	public static void main(String args[]) {
		MothersKitchen.food();
		MothersKitchen.food();
		MothersKitchen.food2();
	}	
}
class Kitchen{
	int i;
}
class MothersKitchen extends Kitchen{
	int i;
	public MothersKitchen(int i) {
		System.out.println("mothers kitchen cons called....");
		this.i=i;
		super.i=i;
	}
	static {
		System.out.println("static block........");
	}
	public void meet() {
		i=90;
	}
	public static void food() {
		//this.i=90; - this cannot be used in static context
		//i=9;//non static fields cannot be referred in static context
		//super.i=8;//cannot use super in static context
		MothersKitchen obj=new MothersKitchen(1);
		obj.i=0;
		System.out.println("yummy.......................");
	}	
	public static void food2() {
		System.out.println("yummy22222222222222222.......................");
	}	
}
package ch6;
//https://fluvid.com/videos/detail/ykZL6cknRkhY9w96G#.YhWfgfrQnjs.link
public class ConsDemo {
	ConsDemo(){//constructor
		System.out.println("cons called...");
	}
	String s;
	
	ConsDemo(String s){
		System.out.println("Cons called....:"+s);
		s=s;
	}
	ConsDemo(String s, int i){
		System.out.println("Cons called....:"+s+"............"+i);
		
	}
	public static void main(String[] args) {
		ConsDemo obj=new ConsDemo();
		System.out.println("...............");
		
		ConsDemo obj2=new ConsDemo("hello");
		
		System.out.println(obj2.s);
		
		ConsDemo obj3=new ConsDemo("hello",1000);
	}
}

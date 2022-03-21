package revision;
//https://fluvid.com/videos/detail/e-KdETV7P-t5d1wwD#.YjFIEFAgRlo.link
public class ClassDemo1 {
	int age=20;//simple type
	String str="hello world";//simple types
	int arr[]=new int[4];//simple types
	MyType myt=new MyType();//complex type	
	int weight=met2("heavydfd");
	public static void main(String[] args) {
		ClassDemo1 obj=new ClassDemo1();
		obj.met1();
		System.out.println(obj.weight);		
	}
	void met1() {
		System.out.println(myt.age+":"+myt.name);//reading
		myt.age=40;//writing
		myt.name="aspire 2022";
		System.out.println(myt.age+":"+myt.name);
		
		myt.setWeightProperty("heavy");
		System.out.println(myt.weight);
	}	
	int met2(String s) {
		if(s.equals("heavy")) {
			return 10;
		}
		else {
			return 5;
		}
	}
}

class MyType{
	String name="aspire";
	int age=20;
	String prop="heavy";
	int weight=getWeight(getWeightProperty());
	
	int getWeight(String s) {
		if(s.equals("heavy")) {
			return 100;
		}
		else {
			return 50;
		}
	}
	String getWeightProperty() {
		return this.prop;
	}
	void setWeightProperty(String prop) {
		this.prop=prop;
		weight=getWeight(this.prop);
	}
}
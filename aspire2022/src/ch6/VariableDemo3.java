package ch6;
//https://fluvid.com/videos/detail/oKxdEh6a1_CDjody4#.YhWXrlcGA0s.link
public class VariableDemo3 {
	//local, instance,class  - scope
	//local variable-is declared with in a method
	//instance Variable - any variable declared outside a method is a instance variable
	//class variable - any variable declared with the keyword static is called class variable
	
	int s;
	static int ss;
	void met(int i) {
		System.out.println(i);
	}
	void met2(long ll) {
		System.out.println(ll);
	}
	
	public static void main(String[] args) {
		VariableDemo3 obj=new VariableDemo3();
		
		obj.s=10;
		//obj.ss=1000;
		VariableDemo3.ss=1000;
		
		VariableDemo3 obj2=new VariableDemo3();
		
		System.out.println(obj.s+":"+obj2.s);
		System.out.println(obj.ss+":"+obj2.ss);
		
		obj2.s=20;
		//obj2.ss=2000;
		VariableDemo3.ss=2000;
		
		System.out.println(obj.s+":"+obj2.s);
		//System.out.println(obj.ss+":"+obj2.ss);
		System.out.println(VariableDemo3.ss+":"+VariableDemo3.ss);
		
		//local variable
		
		obj.met(999);
		VariableDemo3 objX=obj;
		objX.met(888);
		System.out.println(obj.s+":"+objX.s);
	}
}

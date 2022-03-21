package revision;
//https://fluvid.com/videos/detail/aQadEUdeL_FnP2yZe#.Yjfl0u3p6UE.link
public class ClassDemo4 {
	//METHOD OVERLOADING - used to achieve polymorphism
	//dynamic method dispatch / virtual method invocation - POLYMORPHISM
	public void met() {
		System.out.println("empty met method is called...");
	}
	
	public void met(int i) {
		System.out.println("met method with param i is called...:"+i);
	}
	
	public static void main(String[] args) {
		ClassDemo4 obj=new ClassDemo4();
		obj.met();
		obj.met(10);
		obj.newhelp(new Medical());
	}
	//DYNAMIC POLYMORPHISM - CLOSED FOR MODIFICATION - IN FAVOUR OF OPEN CLOSE PRINCIPLE
	//GOOD PROGRAMMING
	void help(Fire fire) {
		fire.fireMethod();
	}
	void help(Robbery robbery) {
		robbery.robberyMethod();
	}
	void help(Medical medical) {
		medical.medicalMethod();
	}
	
	//STATIC POLYMORPHISM - OPEN FOR MODIFICATION - AGAINST OPEN-CLOSE PRINCIPLE
	//BAD PROGRAMMING
	void newhelp(Object obj) {
		if(obj instanceof Fire) {
			Fire fire=(Fire)obj;
			fire.fireMethod();
		}
		else if(obj instanceof Medical) {
			Medical medical=(Medical)obj;
			medical.medicalMethod();
		}
		else if(obj instanceof Robbery) {
			Robbery robbery=(Robbery)obj;
			robbery.robberyMethod();
		}
	}
}
class Fire{
	public void fireMethod() {
		System.out.println("fire in the mountain run run run....");
	}
}
class Robbery{
	public void robberyMethod() {
		System.out.println("robbery in the town lock lock lock....");
	}
}
class Medical{
	public void medicalMethod() {
		System.out.println("ambulance running vak vak vak...");
	}
}
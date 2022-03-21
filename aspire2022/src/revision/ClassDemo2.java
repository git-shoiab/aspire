package revision;
//https://fluvid.com/videos/detail/448axCd43zfBRDMdM#.YjFOwdonEoE.link
// simple types will be always pass by value and 
//complex types will be always pass by reference
public class ClassDemo2 {
	public static void main(String[] args) {
		ClassDemo2 obj=new ClassDemo2();
		
		Laddu myLaddu=new Laddu();
		
		System.out.println("size of laddu..:"+myLaddu.size);//10
		obj.setSize(myLaddu.size);//Note: when u pass a value - remember always a copy is passed
		System.out.println("size of laddu after passing..:"+myLaddu.size);//10
		
		System.out.println("size of laddu..:"+myLaddu.size);//10
		obj.setSize(myLaddu);//Note; Pass by reference - the original is passed..
		System.out.println("size of laddu after passing..:"+myLaddu.size);//5
	}
	
	void setSize(int size) {
		size=5;
	}
	
	void setSize(Laddu laddu) {
		laddu.size=5;
	}
}

class Laddu{
	int size=10;
}
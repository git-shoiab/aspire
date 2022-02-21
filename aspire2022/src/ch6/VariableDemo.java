package ch6;
//https://fluvid.com/videos/detail/v_v8rS1KRKh4rgVGq#.YhL2ab7PCus.link
public class VariableDemo {

	
	
	public static void main(String[] args) {
		Laddu laddu=new Laddu();//complex type
		
		VariableDemo vd=new VariableDemo();
		
		//PASS BY VALUE
		System.out.println("before passing ..:"+laddu.size);
		vd.Pbv(laddu.size);
		System.out.println("after passing ..:"+laddu.size);
		
		
		//PASS BY REFERENCE
		
		System.out.println("PBR-before passing ..:"+laddu.size);
		vd.pbr(laddu);
		System.out.println("PBR-after passing ..:"+laddu.size);
		
	}
	
	void Pbv(int size) {
		size=5;
	}
	
	void pbr(Laddu lad) {
		lad.size=5;
	}
}


class Laddu{
	
	int size=10;//primitive type
}
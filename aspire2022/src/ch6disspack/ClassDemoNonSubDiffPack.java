package ch6disspack;

import ch6.ClassDemo1;

public class ClassDemoNonSubDiffPack {
	void met() {
		ClassDemo1 obj=new ClassDemo1();
		//System.out.println(obj.pri);//- CLASS SCOPE
		//System.out.println(obj.nomod);// - PACKAGE SCOPE
		//System.out.println(obj.pro);//- RELATION SCOPE
		System.out.println(obj.pub);//- GLOBAL SCOPE
	}
}

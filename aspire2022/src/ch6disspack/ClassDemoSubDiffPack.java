package ch6disspack;

import ch6.ClassDemo1;

public class ClassDemoSubDiffPack extends ClassDemo1{//ch6.ClassDemo1{//qname
	void met() {
		//System.out.println(pri);//- CLASS SCOPE
		//System.out.println(nomod);//package scope
		System.out.println(pro);//relation scope - top u have inheritance
		System.out.println(pub);
	}
}

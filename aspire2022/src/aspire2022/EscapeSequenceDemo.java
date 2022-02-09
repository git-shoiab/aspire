package aspire2022;

public class EscapeSequenceDemo {
	
public static void main(String[] args) {
	System.out.println("Hello \"Aspire\" world..");
	System.out.println("Hello \'Aspire\' world");
	
	System.out.println("hello \t\t aspire \t world");;
	System.out.println("hello \n\t aspire \n\t\t world");
	
	System.out.println("Hello \f World");
	
	System.out.println("Hello \b\b\b\bWorld");
	
	System.out.println("Hello Hello\rWorld");
	int count=0;
	while(true) {
		System.out.print(count+++"\r");
	}
}
}

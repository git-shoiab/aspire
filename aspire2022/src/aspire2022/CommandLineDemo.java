package aspire2022;

public class CommandLineDemo {
	public static void main(String[] args) {
		
		String s1=args[0];
		String s2=args[1];
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		
		System.out.println("Addition is..:"+(n1+n2));
	}
}

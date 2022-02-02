package aspire2022;

public class OperatorsDemo2 {
	public static void main(String[] args) {
		int i=10;
		
		//i=i+1;//simple
		
		//i++;//more simple - post increment
		
		//++i;//pre increment
		
		System.out.println(i++);//it prints first and then increments
		
		System.out.println(i);
		
		i=10;
		
		System.out.println(++i);//it increments first and then prints
		System.out.println(i);
		
		i=10;
		System.out.println(i--);//prints first and then decrements
		System.out.println(i);
		
		i=10;
		System.out.println(--i);
		
		i=10;
		
		//i=i+4;
		i+=4;//more simple
		System.out.println(i);
		
		i=10;
		i-=3;
		System.out.println(i);
		
		i=10;
		i%=2;
		System.out.println(i);
		
		System.out.println(i==4);
	}
}

package aspire2022;

public class TypeCastingDemo {
	public static void main(String[] args) {
		byte b=120;//8 bit
		short s=b;//this is 100% compatible - because lower can easily fit in higher type
		//the above statement auto upgrades the byte into short
		//auto type promotion will happen when a lower is assigned to higher
		
		//b=s;//the reverse is not acceptable - because 16 bit cannot go into 8 bit
		
		b=(byte)s;//this approach is what we call as type casting
		
		System.out.println(b);
		//INTERNALLY java has reduced the 16 bit type into 8 bit type - their by the whole value could be different
		
		
		int i=258;
		
		b=(byte)i;
		
		System.out.println(b);
		
		//java divides the number by 256 (size of byte) and the reminder is given as value
		
		/*
		 * when you do a downcasting that is from a higher to a lower
		 * if the value is acceptable then it assigns the value
		 * if the value is higher then it does a mathematical calculation and reduces the value
		 * so in downcasting we loose the precision
		 */
		
		float f=120;
		f=123.45f;//f is mandatory for values which has decimal points
		
		double d=f;
		
		f=(float)d;
		
		char c='a';
		c=97;
		
		c=(char)i;//you cannot assign a int to a character
		i=c;//you can assign a character to a int - compatible
		
		
	}
}

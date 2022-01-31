package aspire2022;
/*
 * Objetive of this program
 * 1. We learned how to give comments - Both single line and block level
 * 2. PRIMITIVE data types
 * 3. COMPLEX data types
 */
public class VariablesDemo {
	public static void main(String[] args) {
		//4 types of variables
		//1. number 2. floats 3. character 4. boolean
		
		//NUMBER TYPES
		byte weight=100;// value 100 is assigned to a variable weight of type byte
		
		short distance=4500;
		
		int years=45555;
		
		long distanceToMoon=543543543553453L;
		
		/*
		 * byte - 8 bits
		 * short - 16 bits
		 * int - 32 bits
		 * long - 64biy
		 */
		//RANGE
		weight=127;//maximum value
		weight=-128;//min value
		
		distance=32767;//maximum value
		distance=-32768;//minimum value
		
		years=2147483647;//max value
		years=-2147483648;//min value
		
		distanceToMoon=9223372036854775807L;//max value
		distanceToMoon=-9223372036854775808L;//min value
		
		//FLOATS - 32 bit
		
		float price=233;
		price=343434.45F;//mandatory to give F for values which has a decimal 
		
		//64 bit
		double highValue=34344.4545;
		
		//CHARACTER
		
		char c='a';
		c=97;//97 is the ASCII value of a (AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE)
		
		//BOOLEAN
		
		boolean understood=true;
		understood=false;
		//only two values either true/false can be given to variables
		
		//ONE EXTRA TYPE
		
		//STRING - ITS NOT A PRIMITIVE TYPE BUT COMPLEX TYPE
		
		String msg="Hello World";
		
		//COMPLEX TYPES OF PRIMITIVE TYPES
		Byte b=127;
		b=Byte.valueOf(weight);
		
		Short s=23233;
		s=Short.valueOf(distance);
		
		Integer i=34344;
		i=Integer.valueOf(distance);
		
		Long l;
		Float f;
		Double d;
		Character cc;
		Boolean bb;
		
	}
}

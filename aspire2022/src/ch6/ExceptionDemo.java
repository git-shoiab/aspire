package ch6;
//https://fluvid.com/videos/detail/37jwQhO3RoUy1G-Eg#.YigI3fhZZ3A.link

//this program demonstrates how to ensure that program 
//runs without getting terminated abruptly
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("before exception");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("please enter a value other than zero...");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("you need to enter a value in the command line...");
		}
		catch(NumberFormatException ne) {
			System.out.println("please enter a valid number other than zero...");
		}
		catch(Exception ee) {
			System.out.println("unknown exceptions....come here...");
		}
		finally {
			System.out.println("finally called...");
		}
		System.out.println("After exception");
	}
}

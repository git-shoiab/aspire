package aspire2022;

public class ConditionDemo3 {
	public static void main(String[] args) {
		
		String date="07 march 2022";
		
		String month=date.substring(3,6);
		
		System.out.println(month);
		
		if(month.equals("feb")) {
			System.out.println("February month.......");
		}
		else if(month.equals("jan")) {
			System.out.println("This is january month....");
		}
		else if(month.equals("mar")) {
			System.out.println("This is march month....");
		}
		else {
			System.out.println("rest I am yet to check...");
		}
	}
}

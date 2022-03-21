package ch6;
//https://fluvid.com/videos/detail/KR9rGt65xATapqyXp#.YigPif2UeK0.link

public class ExceptionDemo2 {
	public static void main(String[] args) {
		LLRDriver somu=new LLRDriver();
		try{
			somu.drive("bumpy");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


class LLRDriver{
	public void drive(String road)throws Exception {
		System.out.println("normal driving...");
		if(road.equals("bumpy")) {
			throw new Exception();
		}
	}
}
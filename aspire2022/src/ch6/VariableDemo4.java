package ch6;
//https://fluvid.com/videos/detail/oKxdEh6a1_CDjody4#.YhWXrlcGA0s.link
public class VariableDemo4 {
	public static void main(String[] args) {
		TrainingRoom netaji=new TrainingRoom();
		
		TrainingRoom shastri=new TrainingRoom();
		
		System.out.println(netaji.sanyo+":"+shastri.sanyo);
		
		System.out.println(netaji.sulab+":"+shastri.sulab);
		System.out.println(TrainingRoom.sulab+":"+TrainingRoom.sulab);
	}
}


class TrainingRoom{
	Projector sanyo=new Projector();//INSTANCE VARIABLE
	static Toilet sulab=new Toilet();//CLASS VARIABLE
}

class Projector{
	
}

class Toilet{
	
}
package tw.org.iii.claassroom;
//How to use class , BikeEx
public class Duck24 {

	public static void main(String[] args) {
		BikeEx myBike, urBike;
		myBike = new BikeEx();
		urBike = new BikeEx();
		System.out.println("myBike: "+myBike.getSpeed());
		System.out.println("urBike: "+urBike.getSpeed());
		
		System.out.println("---");
		for(int i=0;i<=14;i++)
		myBike.upSpeed();

		
		urBike.upSpeed();
		urBike.upSpeed();
		urBike.downSpeed();

		System.out.println("myBike: "+myBike.getSpeed());
		System.out.println("urBike: "+urBike.getSpeed());

	}

}

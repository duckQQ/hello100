package tw.org.iii.claassroom;

public class BikeEx {
	// Field 屬性
	private double speed;

	//Constructor 名稱與類別名稱大小寫相同，無傳回值 ex void, double...
	BikeEx(){
		speed =1;
		System.out.println("Bike():" + speed);
	}	

	// Method
	void upSpeed(){
		speed = speed<1?1:speed*1.2;
	}
	void downSpeed(){
		speed = speed<1?0:speed*0.7;
	}
	double getSpeed(){
		return speed;
	}
	
	
}

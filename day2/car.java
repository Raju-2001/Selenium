package week1.day2;

public class car {
	public void applyBreak()
	{
		System.out.println("Apply Break");
	}
	public void applyGear()
	{
		System.out.println("Apply Gear");
	}
	public void switchOnAc()
	{
	System.out.println("Switch On AC");
	}
	public void applyAcclerate()
	{
		System.out.println("Apply Accelerate");
	}
	public static void main(String[] args) {
		car audi=new car();
		audi.applyBreak();
		audi.applyGear();
		audi.switchOnAc();
		audi.applyAcclerate();
	}
	
	
}
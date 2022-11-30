package week1.day2;

public class mobile {
	String mobileBrandName="OnePlus";
	char mobileLogo='O';
	short noOfMobilePiece=3;
	int modelNumber=6;
	long mobileImeiNumber=9846846786478847L;
	float mobilePrice=40000.07f;
	boolean isDamaged=false;



public static void main(String[] args) {
	mobile mob=new mobile();
	System.out.println("mobileBrandName "+mob.mobileBrandName);
	System.out.println("mobileLogo "+mob.mobileLogo);
	System.out.println("noOfMobilePiece "+mob.noOfMobilePiece);
	System.out.println("modelNumber "+mob.modelNumber);
	System.out.println("mobileImeiNumber "+mob.mobileImeiNumber);
	System.out.println("mobilePrice "+mob.mobilePrice);
	System.out.println("isDamaged "+mob.isDamaged);

	}
}

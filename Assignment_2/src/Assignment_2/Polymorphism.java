package Assignment_2;

class Commercial
{
	void calculateBill(int unit)
	{
		System.out.println("Your Commercial Unit is: "+unit+"\nBill: "+unit*10);
	}
}

class Domestic extends Commercial
{
	void calculateBill(int unit)
	{
		System.out.println("Your Domestic Unit is: "+unit+"\nBill: "+unit*5);
//		super.calculateBill(unit);	 when we want call parent class method :)
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// method overriding in java
		Domestic d = new Domestic();
		d.calculateBill(10);
		
	}

}

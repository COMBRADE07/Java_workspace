package Assignment_2;

abstract class lets_go
{
	int demo;
	abstract void calculateBill(int unit);
	
}


public class DemoAbsrt extends lets_go{

	
	void calculateBill(int unit)
	{
		System.out.println("Your Commercial Unit is: "+unit+"\nBill: "+unit*10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of abstract class
		
		lets_go l = new DemoAbsrt();
		l.calculateBill(50);
	}

}

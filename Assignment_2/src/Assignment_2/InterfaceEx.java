package Assignment_2;
interface mother_father
{
	double ChildHeight(double mh, double fh);
}
public class InterfaceEx implements mother_father {

	public static void main(String[] args) {
		// lets create object for Interface
		
		InterfaceEx IF = new InterfaceEx();
		double x = IF.ChildHeight(5.2, 5.7);
		System.out.println("Height of Child: "+x);
	}

	@Override
	public double ChildHeight(double mh, double fh) {
		// Definition of child height...
		double z;
		z= (mh+fh)/2;
		return z;
	}

}

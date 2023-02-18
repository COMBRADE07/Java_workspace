package Assignment_2;

public class constructorOverloading {
	String x="Default constructor";
	int l=5,b=5;
	public constructorOverloading()
	{
		
		System.out.println("area of ractangle: "+l*b);
	}
	
	public constructorOverloading(int l,int b)
	{ 
		this.l = l;
		this.b = b;
		System.out.println("area of ractangle: "+l*b);
	}
	public static void main(String[] args) {
		// get set lets go...
		
		constructorOverloading x = new constructorOverloading();
		
		// parameterised...
		
		constructorOverloading y = new constructorOverloading(10,20);

	}

}

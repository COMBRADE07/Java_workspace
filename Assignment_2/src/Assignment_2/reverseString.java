package Assignment_2;

public class reverseString {

	public static void main(String[] args) {
		// Reverse the string...
		String s="Hello";
		revese(s);

	}

	public static void revese(String s) {
		// TODO Auto-generated method stub
		int len = s.length()-1;
		char[] x=s.toCharArray();
		for(int i=len;i>=0;i--)
		{
			System.out.print(x[i]);
		}
	}

}

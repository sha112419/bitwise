package testing;

public class bitwise {

	public static void main(String[] args) {
		int a=-11;
		int b=2;
		int c;
		c=a&b;
		System.out.println("a&b"+c);
		c=a|b;
		System.out.println("a|c"+c);
		c=~a;
		System.out.println("~a"+c);
		c=a^b;
		System.out.println("a^b"+c);
		
		int x=21;
		int y=3;
		int z;
		z=x<<y;
		System.out.println("x<<y"+z);
		
	}

}

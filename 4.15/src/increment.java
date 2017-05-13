
public class increment {
	public static void main(String[] args)
	{
		int c =5;
		System.out.printf(" c before increment: %d%n", c );
		System.out.printf(" c postincrement: %d%n", c++ );
		System.out.printf(" c after increment: %d%n", c );
		
		System.out.println();
		
		c =5;
		System.out.printf(" c before increment: %d%n", c );
		System.out.printf(" c postincrement: %d%n", ++c);
		System.out.printf(" c after increment: %d%n", c );
	}
}


public class arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Star Pattern");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Inverse Star pattern ");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Arrow Star pattern ");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

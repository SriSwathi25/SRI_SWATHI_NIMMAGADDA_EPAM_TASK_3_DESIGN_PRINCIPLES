import java.util.Scanner;

public class Functions{
	long a;
	long b;
	int choice;
	Scanner s=new Scanner(System.in);
	public void take_inputs()
	{
		System.out.println("Options\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n\n***SELECT AND OPTION***");
		choice=s.nextInt();
		System.out.println("Enter first number : ");
		this.a=s.nextInt();
		System.out.println("Enter second number : ");
		this.b=s.nextInt();
	}
	public long add(long a,long b)
	{
		return a+b;
	}
	public long subtract(long a,long b)
	{
		return a-b;
	}
	public long multiply(long a,long b)
	{
		return a*b;
	}
	public void divide(long a,long b)
	{try {
		System.out.println(a/b);
	}
	catch(Exception e)
	{
		System.out.println("Cannot divide by zero");
		return;
	}
	}
}
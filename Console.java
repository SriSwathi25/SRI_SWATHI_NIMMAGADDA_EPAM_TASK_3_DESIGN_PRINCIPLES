import java.io.*;
import java.util.*;

public class Console extends Functions{
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	Functions fun=new Functions();
	long res=0;
	fun.take_inputs();
	switch(fun.choice) {
	case 1 : res=fun.add(fun.a,fun.b);
	System.out.println("Answer is : "+res);
	break;
	case 2 : res=fun.subtract(fun.a,fun.b);
	System.out.println("Answer is : "+res);
	break;
	case 3 : res=fun.multiply(fun.a,fun.b);
	System.out.println("Answer is : "+res);
	break;
	case 4 : fun.divide(fun.a,fun.b);
	
	break;
	
	}
	}
	
}


public class Demo_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("open files");
	int n=args.length;
	System.out.println(n);
	int a=45/n;
	System.out.println("a="+a);
	int b[]= {10,20,40};
	b[50]=100;
	}
catch(ArithmeticException ae) {
	System.out.println(ae);
	System.out.println("please pass data while running the program");
	
}
catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
	System.out.println("please see that the array index is within the range");
	
}
finally {
	System.out.println("close the files");
}
	}
	}


public class MyException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=0;
double a;
System.out.println("main starts");
try {
	System.out.println("try starts");
		 a=x/y;
   }catch(ArithmeticException e)
{
	   System.out.println("main ends");
}finally {
	MyException E=new MyException();
	E.hashCode();
	
	System.out.println("finally......");
}

	   

	}

}

package Exception;

public class ExceptionPropagation {
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught "+e.getMessage());
		}
	}
	public static void method1() throws Exception{
		method2();
	}
	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Exception occured in the method 2");
	}
}

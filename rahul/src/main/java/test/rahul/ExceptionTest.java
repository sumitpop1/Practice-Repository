package test.rahul;

public class ExceptionTest {
	int checkException(){
		try{
			int i = 5/0;
		} catch (ArrayIndexOutOfBoundsException arr){
			return 1;
		} catch (ArithmeticException ae){
			return 2;
		} catch (Exception e){
			return 3;
		} finally{
			return 4;
		}
		
		//return 0;
	}
	public static void main(String args []){
		ExceptionTest et = new ExceptionTest();
		System.out.println(et.checkException());
	}
}

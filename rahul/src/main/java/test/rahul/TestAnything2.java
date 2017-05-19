package test.rahul;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestAnything2 implements TestAnything{

	public static void main(String[] args) throws CustomException {
	Employee e1 = new Employee();
	System.out.println(e1.getSalary("Rahul"));
	try{
		int i = 100/0;
	} catch (ArithmeticException e){
		log.log(Level.INFO, "Handled "+e);
		throw new CustomException("Don't Devide by 0");
	}
	finally{
		log.info("Finally");
	}
	}
	private static Logger log = Logger.getLogger(TestAnything2.class.getName());
}

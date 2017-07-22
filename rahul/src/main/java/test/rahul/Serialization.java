package test.rahul;

import java.io.Serializable;

public class Serialization implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9199801932111671012L;
	int i = 1;
	transient int j = 2;
	
	void getValues(){
		System.out.println("i = "+i+" and j = "+j);
	}
}

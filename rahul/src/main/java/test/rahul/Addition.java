package test.rahul;

public class Addition {
	int a = 0;
	int b = 0;
	public Addition (int a, int b){
		this.a = a;
		this.b = b;
	}
	public void additionWOThird(){
		a = a + b;
		b = a - b;
		a = a - b;		
	}
	int getA(){
		return a;
	}
	int getB(){
		return b;
	}
}

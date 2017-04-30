package test.rahul;

public enum Season{   
WINTER(5,2), SPRING(10,2), SUMMER(15,4), FALL(20,8);   
  
private int testValue;
private int anotherValue;
private Season(int value, int value2){  
this.testValue=value; 
this.anotherValue=value2;  

}  

int getValue(){
	return testValue;
}
public static void main(String args[]){  
//for (Season s : Season.values())  
//System.out.println(s+" "+s.testValue+" "+s.anotherValue);  
System.out.println(Season.valueOf("WINTER").anotherValue);  
}
}  

class test2{
	
}
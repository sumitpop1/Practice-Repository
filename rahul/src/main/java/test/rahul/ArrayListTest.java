package test.rahul;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		Customer first = new Customer("Rahul", 29);
		Customer second = new Customer("Sumit", 22);
		
		ArrayList<Customer> arrList = new ArrayList<Customer>();
		arrList.add(first);
		arrList.add(second);
		
//		List l = new SynchronizedList(List l);
		Iterator <Customer> iterator = arrList.iterator();
		while(iterator.hasNext()){
			Customer cust =  iterator.next();
			System.out.println(cust.getName()+" "+cust.getAge());
			
		}
		
		for(Customer cust : arrList){
			System.out.println(cust.getName()+" "+cust.getAge());		
		}
	}

}

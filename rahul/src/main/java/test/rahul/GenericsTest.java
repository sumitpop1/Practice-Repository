package test.rahul;

import java.util.List;
import java.util.ArrayList;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		String str = list.get(0);	
		System.out.println(str);
	}

}

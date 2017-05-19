package test.rahul;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	 Map <String, Double> myMap = new HashMap<String, Double>();

	 public Employee() {
		myMap.put("Rahul", 200.0);
		myMap.put("Pooja", 200.0);
		myMap.put("Rahul", 500.0);
		myMap.put("Sumit", 200.0);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myMap == null) ? 0 : myMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (myMap == null) {
			if (other.myMap != null)
				return false;
		} else if (!myMap.equals(other.myMap))
			return false;
		return true;
	}

	double getSalary(String name){
		return myMap.get(name);
	}
}

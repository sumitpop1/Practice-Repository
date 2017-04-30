package test.rahul;

import java.util.ArrayList;
import java.util.List;

public class Games {
	List<String> list = new ArrayList<String>();
	{
		list.add("Cricket");
		list.add("Football");
	}
	public synchronized void getGamesLamda(){
		list.forEach(games -> System.out.println(games));
		try {
			System.out.println("Notifying now after Lamda");
			wait();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void getMethodExpression(){
		System.out.println("Started running again in method expression");
		list.forEach(System.out::println);
		System.out.println("Waiting");
		try {
			notify();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

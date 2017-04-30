package test.rahul;

public class ForEachTest {

	public static void main(String[] args) throws InterruptedException {
		Games games = new Games();
		WaitDecision wd1= new WaitDecision(games, true);
		Thread t1 = new Thread(wd1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		System.out.println("t1 executing");
		WaitDecision wd2= new WaitDecision(games, false);
		//Thread.sleep(1000);
		Thread t2 = new Thread(wd2);
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		System.out.println("t2 executing");

	}

}

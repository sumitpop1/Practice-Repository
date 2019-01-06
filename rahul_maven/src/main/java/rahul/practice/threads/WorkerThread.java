/**
 * @author: Rahul
 */
package rahul.practice.threads;

/**
 * @author Rahul
 *
 */
public class WorkerThread implements Runnable{

	int task;
	/**
	 * @param i
	 */
	WorkerThread(int i) {
		task = i;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		System.out.println("Thread will sleep now while executing task "+task+" ....");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
}

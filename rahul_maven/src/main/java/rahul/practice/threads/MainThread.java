/**
 * @author: Rahul
 */
package rahul.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rahul
 *
 */
public class MainThread {
	
	public static void main(String args[]){
		ExecutorService threadExecutor = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 50; i++){
			Runnable worker = new WorkerThread(i);
			threadExecutor.execute(worker);
		}
		threadExecutor.shutdown();
//		while(!threadExecutor.isTerminated()){
//			System.out.println("Task(s) is/are still runninng..");
//		}		
	}
}

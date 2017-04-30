package test.rahul;

public class WaitDecision implements Runnable{
	
	Games gamesObj;
	boolean lamdaOrMethod;
	public WaitDecision(Games gamesObj, boolean lamdaOrMethod){
		this.gamesObj = gamesObj;
		this.lamdaOrMethod = lamdaOrMethod;
	}

	@Override
	public void run() {
		try {
			System.out.println("WaitDecision running");
			if(lamdaOrMethod)
				gamesObj.getGamesLamda();
			else
				gamesObj.getMethodExpression();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package pattern.design.state.turnstile;

public class Client {
	
	public static void main(String args[])
	{
		StateContext stateContext = new StateContext();
		
		System.out.println("Starting");
		
		stateContext.push();
		stateContext.putCoin();
		stateContext.putCoin();
		stateContext.push();
		stateContext.push();
		
		
	}

}

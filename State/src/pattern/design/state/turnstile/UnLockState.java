package pattern.design.state.turnstile;

public class UnLockState implements State {

	StateContext stateContext ;
	
	public UnLockState(StateContext stateContext) 
	{
		this.stateContext = stateContext;
	}

	@Override
	public void push()
	{
		System.out.println("welcome to DMRC"); 
		stateContext.setState(new LockState(stateContext));
	}

	@Override
	public void putCoin() 
	{
		System.out.println("already coin present");
	}

}

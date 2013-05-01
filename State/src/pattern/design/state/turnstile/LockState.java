package pattern.design.state.turnstile;

public class LockState implements State 
{
	StateContext stateContext ;

	public LockState(StateContext stateContext) 
	{
		this.stateContext = stateContext;
	}

	@Override
	public void push()
	{
		System.out.println("you need to add coin");
	}

	@Override
	public void putCoin()
	{
		stateContext.setState(new UnLockState(stateContext));
	}

}

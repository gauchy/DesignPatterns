package pattern.design.state.turnstile;

public class StateContext 
{

	private State state = null;
	StateContext()
	{
		setState(new LockState(this));
	}
	protected State getState()
	{
		return state;
	}
	protected void setState(State state) 
	{
		this.state = state;
	}
	
	public void putCoin()
	{
		state.putCoin();
	}
	
	public void push()
	{
		state.push();
	}
	
	
}

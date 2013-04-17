package pattern.design.command.example.crash;

public class JobA extends  AbstractJob {

	
	
	@Override
	public void execute() 
	{
		System.out.println("Executing jobA");
		try {
			Thread.sleep(1000); //sleep equivalent to job operation
		} catch (InterruptedException e) 
		{
			
		}
		
		invokeRandomCrash();
		
		setStatus(Status.Completed);
		
	}

	private void invokeRandomCrash() 
	{
		int i = (int) (Math.random()*5);
		if(i == 4)
		{
			System.out.println("crashing the thread without completing job");
			throw new RuntimeException();
		}
			
	}


}

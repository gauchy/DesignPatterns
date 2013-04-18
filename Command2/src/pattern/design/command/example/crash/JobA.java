package pattern.design.command.example.crash;

public class JobA extends  AbstractJob {

	
	
	@Override
	public void execute() 
	{
		System.out.println("Executing jobA");
		try {
			Thread.sleep(3000); //sleep equivalent to job operation
		} catch (InterruptedException e) 
		{
			
		}
		
		invokeRandomCrash();
		System.out.println("Execution finished jobA");
		setStatus(Status.Completed);
		
	}

	private void invokeRandomCrash() 
	{
		int i = (int) (Math.random()*3);
		if(i == 1)
		{
			Controller.executorCount--;
			this.setStatus(Status.Crash);
			System.out.println("crashing the thread without completing job");
			throw new RuntimeException();
		}
			
	}

	@Override
	public String getDescription() 
	{
		return "JobA";
	}


}

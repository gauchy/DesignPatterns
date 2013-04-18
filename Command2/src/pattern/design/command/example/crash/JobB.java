package pattern.design.command.example.crash;

public class JobB extends  AbstractJob {

	
	@Override
	public void execute()
	{
		System.out.println("Executing JobB");
		try 
		{
			Thread.sleep(1500); //sleep equivalent to job operation
		} catch (InterruptedException e) 
		{
			//e.printStackTrace();
			
		}
		System.out.println("Execution finished jobB");
		setStatus(Status.Completed);
	}
	@Override
	public String getDescription() 
	{
		return "JobB";
	}

}

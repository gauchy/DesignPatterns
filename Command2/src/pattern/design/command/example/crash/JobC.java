package pattern.design.command.example.crash;

public class JobC extends  AbstractJob{

	@Override
	public void execute() 
	{
		System.out.println("Executing JobC");
		try {
			Thread.sleep(4500); //sleep equivalent to job operation
		} catch (InterruptedException e) 
		{
			//e.printStackTrace();
			
		}
		System.out.println("Execution finished jobC");
		setStatus(Status.Completed);
	}
	
	@Override
	public String getDescription() 
	{
		return "JobC";
	}

}

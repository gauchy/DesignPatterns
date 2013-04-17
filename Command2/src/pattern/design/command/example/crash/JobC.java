package pattern.design.command.example.crash;

public class JobC extends  AbstractJob{

	@Override
	public void execute() 
	{
		System.out.println("Executing JobC");
		try {
			Thread.sleep(1500); //sleep equivalent to job operation
		} catch (InterruptedException e) 
		{
			//e.printStackTrace();
			
		}
		
	}

}

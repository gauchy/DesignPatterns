package pattern.design.command.example.crash;

public class Controller {
	public static final int MAX_EXECUTOR =2;
	public static int executorCount = 0;
	private static int threadCount = 0;
	
	Controller()
	{
		initialiseJobCreator();
		initialiseExecutor();
	}
	private void initialiseExecutor() 
	{
		while(true)
		{
			if(executorCount< MAX_EXECUTOR)
			{
				Thread t = new Thread(new Executor());
				t.start();
				executorCount++;
				threadCount++;
				System.out.println("Controller: Creating Executor" + threadCount);
				
			}
			
			sleep(); //sleep for sometime and again check for creation of executor
		}
	}
	private void sleep()
	{
		try
		{
			Thread.sleep(900);
		} 
		catch (InterruptedException e)
		{
			
		}
		
	}
	private void initialiseJobCreator()
	{
		Thread jobcreatorThread = new Thread(new JobCreator());
		jobcreatorThread.start();
	}
	public static void main(String args[])
	{
		new Controller();
	}

}

package pattern.design.command.example.crash;

public class Executor implements Runnable 
{

	@Override
	public void run()
	{
		JobQueue jobQueue = JobQueue.getInstance();
		while(true)
		{
			Job job = jobQueue.getJob();
			if(job == null)
			{
				System.out.println("Executor: Waiting for job");
				try
				{
					Thread.sleep(4500);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			else
				job.execute();
			
			
		}
	}

}

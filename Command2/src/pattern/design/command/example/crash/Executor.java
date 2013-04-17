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
				System.out.println("Waiting for job");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			job.execute();
			
			
		}
	}

}

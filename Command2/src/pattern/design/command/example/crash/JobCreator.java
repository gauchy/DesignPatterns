package pattern.design.command.example.crash;

public class JobCreator implements Runnable
{

	@Override
	public void run()
	{
		JobQueue jobQueue = JobQueue.getInstance();
		while(true)
		{
			Job job = getRandomJob();
			System.out.println("JobCreator: creating " +job.getDescription());
			jobQueue.add(job);
			sleep(3600);
		}
	}

	private void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private Job getRandomJob()
	{
		int i = (int) (Math.random()*3);
		switch(i)
		{
		case 0 : return new JobA();
		case 1: return new JobB();
		case 2: return new JobC();
		default: return new JobA();
		
		}
		
	}

}

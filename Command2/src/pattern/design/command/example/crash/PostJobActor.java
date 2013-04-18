package pattern.design.command.example.crash;

public class PostJobActor implements JobCompleteListener {

	JobQueue jobQueue;
	PostJobActor()
	{
		jobQueue = JobQueue.getInstance();
	}
	@Override
	public void onJobComplete(Job job)
	{
		System.out.println("PostJobActor: removing from queue" +job.getDescription());
		jobQueue.delete(job);
	}

}

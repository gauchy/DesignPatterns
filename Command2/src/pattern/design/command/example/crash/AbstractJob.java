package pattern.design.command.example.crash;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractJob implements Job {

	private Status status = Status.Waiting;
	private List<JobCompleteListener> listJobCompleteListeners = new ArrayList<JobCompleteListener> ();
	
	AbstractJob()
	{
		attachListener(new PostJobActor());
	}
	@Override
	public final Status status()
	{
		return status;
	}

	@Override
	public final void setStatus(Status status) 
	{
		this.status = status;
		if(status == Status.Completed)
			notifyListeners(this);
	}
	
	private void notifyListeners(Job job) 
	{
		for(JobCompleteListener jobCompleteListener : listJobCompleteListeners)
			jobCompleteListener.onJobComplete(job);
	}

	public final void attachListener(JobCompleteListener jobCompleteListener)
	{
		listJobCompleteListeners.add(jobCompleteListener);
	}
	
	public final void removeListener(JobCompleteListener jobCompleteListener)
	{
		listJobCompleteListeners.remove(jobCompleteListener);
	}

}

package pattern.design.command.example.crash;

import java.util.ArrayList;
import java.util.List;

public class JobQueue
{
	private static volatile JobQueue instance;
	private List<Job> jobList = new ArrayList<Job>();
	
	private JobQueue()
	{
		
	}
	
	public static JobQueue getInstance()
	{
		if(instance == null)
		{
			synchronized (JobQueue.class)
			{
				if(instance == null)
				{
					instance = new JobQueue();
				}
			}
		}
		return instance;
	}
	
	public void add(Job job)
	{
		synchronized (jobList) 
		{
			jobList.add(job);
		}
	}
	public void delete(Job job)
	{
		synchronized (jobList) 
		{
			jobList.remove(job);
		}
	}
	public Job getJob()
	{
		synchronized (jobList) 
		{
			if(!jobList.isEmpty())
			{
				for(Job j : jobList)
				{
					if(j.status() == Status.Crash)
					{
						System.out.println("Processing crashed job: " + j.getDescription());
						j.setStatus(Status.Processing);
						return j;
					}
					else if (j.status() ==Status.Waiting)
					{
						j.setStatus(Status.Processing);
						return j;
					}
				}
				return null;
			}
			else
				return null;
		}
	}

	
	
	
	

}

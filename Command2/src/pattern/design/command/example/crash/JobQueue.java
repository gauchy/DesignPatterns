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
			synchronized (instance)
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
				return jobList.get(0);
			}
			else
				return null;
		}
	}
	
	
	

}

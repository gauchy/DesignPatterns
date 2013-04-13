package rai.ashwini.observer;

import java.util.ArrayList;
import java.util.List;

public class Father {
	
	List<SalaryHikeListener> lstObservers = new ArrayList<SalaryHikeListener>();
	public void giveHike()
	{
		System.out.println("Father got hike");
		
		for(SalaryHikeListener observer : lstObservers)
			observer.onSalaryHike();
	}
	
	public boolean attachListener(SalaryHikeListener obj)
	{
		return lstObservers.add(obj);
	}
	public boolean removeListener(SalaryHikeListener obj)
	{
		return lstObservers.remove(obj);
	}

}

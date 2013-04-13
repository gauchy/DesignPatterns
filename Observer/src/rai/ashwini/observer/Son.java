package rai.ashwini.observer;

public class Son implements SalaryHikeListener{

	@Override
	public void onSalaryHike() 
	{
		System.out.println("i want bicycle");
	}

}

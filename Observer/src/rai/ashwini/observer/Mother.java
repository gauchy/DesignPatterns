package rai.ashwini.observer;

public class Mother implements SalaryHikeListener {

	@Override
	public void onSalaryHike()
	{
		System.out.println("I want Jewellery");
	}

}

package remotecontrol.example.headfirst.command;

public class NoCommand implements Command 
{

	@Override
	public void execute() 
	{
		System.out.println("Do Nothing ");
	}

}

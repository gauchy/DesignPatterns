package remotecontrol.example.headfirst.command;

public class TVOnCommand implements Command 
{
	TV tv;
	TVOnCommand(TV tv)
	{
		this.tv = tv;
	}
	@Override
	public void execute() 
	{
		tv.on();
	}

}

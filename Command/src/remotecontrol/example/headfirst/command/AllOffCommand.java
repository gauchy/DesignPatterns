package remotecontrol.example.headfirst.command;


public class AllOffCommand implements Command {

	Command[] commands;
	AllOffCommand(Command...commands)
	{
		this.commands = commands; 
	}
	
	@Override
	public void execute()
	{
		for(Command command :commands)
			command.execute();
	}

}

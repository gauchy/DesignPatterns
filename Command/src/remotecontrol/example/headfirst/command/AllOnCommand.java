package remotecontrol.example.headfirst.command;


public class AllOnCommand implements Command {

	Command[] commands;
	AllOnCommand(Command...commands)
	{
		this.commands = commands; 
	}
	
	
	@Override
	public void execute() {
		for(Command command :commands)
			command.execute();
	}


}

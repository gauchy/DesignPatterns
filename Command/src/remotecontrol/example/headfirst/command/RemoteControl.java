package remotecontrol.example.headfirst.command;

/**
 * RemoteControl for universal remote control which can operate TV , Lights,Fans etc
 * @author gauchy
 *
 */
public class RemoteControl 
{
	Command[] onCommandButtons= new Command[5];
	Command[] offCommandButtons= new Command[5];
	RemoteControl()
	{
		//feeding no commands to all the buttons
		for(int i = 0;i < 5;i++)
		{
			onCommandButtons[i] = new NoCommand();
			offCommandButtons[i] = new NoCommand();
		}
	}
	
	public void setCommand(Command command , int index , Type type)
	{
		if(type == Type.On)
		{
			onCommandButtons[index] = command;
		}
		else
		{
			offCommandButtons[index] = command;
		}
	}
	
	public void buttonPressed(int index , Type type)
	{
		if(type == Type.On)
		{
			onCommandButtons[index].execute();
		}
		else
		{
			offCommandButtons[index].execute();
		}
	}
}
enum Type
{
	On,Off;
};

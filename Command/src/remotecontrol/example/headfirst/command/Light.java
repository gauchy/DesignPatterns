package remotecontrol.example.headfirst.command;

public class Light 
{
	private String room;
	Light(String room)
	{
		this.room = room;
	}
	void on()
	{
		System.out.println("Switching on light : " +room);
	}
	void off()
	{
		System.out.println("Switching off light : " + room);
	}
}

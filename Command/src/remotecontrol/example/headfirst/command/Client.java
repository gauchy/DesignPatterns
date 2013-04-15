package remotecontrol.example.headfirst.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Light hallLight = new Light("hall");
		Light kitchenLight = new Light("kitchen");
		TV tv = new TV();
		Command lightOnHall = new LightOnCommand(hallLight);
		Command lightOffHall = new LightOffCommand(hallLight);
		
		Command lightOnKitchen = new LightOnCommand(kitchenLight);
		Command lighOffKitchen = new LightOffCommand(kitchenLight);
		
		Command tvOn = new TVOnCommand(tv);
		Command tvOff = new TVOffCommand(tv);
		
		Command allOn = new AllOnCommand(tvOn,lightOnHall,lightOnKitchen);
		Command allOff = new AllOffCommand(tvOff,lightOffHall,lighOffKitchen);
		
		
		
		/*Make the remote learn commands*/
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(lightOnKitchen, 0, Type.On);
		remoteControl.setCommand(lighOffKitchen, 0,Type.Off);
		

		remoteControl.setCommand(lightOnHall, 1, Type.On);
		remoteControl.setCommand(lightOffHall,1,Type.Off);
		
		remoteControl.setCommand(tvOn, 2, Type.On);
		remoteControl.setCommand(tvOff, 2, Type.Off);
		
		remoteControl.setCommand(allOn, 3, Type.On);
		remoteControl.setCommand(allOff, 3, Type.Off);
		
		checkRemoteOperations(remoteControl);
		
	}

	private static void checkRemoteOperations(RemoteControl remoteControl) 
	{
		for(int i = 0;i < 5; i++)
		{
			remoteControl.buttonPressed(i, Type.On);
			System.out.println();
			remoteControl.buttonPressed(i, Type.Off);
			System.out.println("--------------------------\n");
			
		}
	}

}

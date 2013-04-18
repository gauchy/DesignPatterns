package pattern.design.facade.example;

public class FacadeStarter {
	private WindowsStarter windowsStarter;
	private ComputerStarter computerStarter;
	private EclipseStarter eclipseStarter;
	private MovieStarter movieStarter;
	
	FacadeStarter()
	{
		computerStarter = new ComputerStarter();
		windowsStarter = new WindowsStarter();
		eclipseStarter = new EclipseStarter();
		movieStarter = new MovieStarter();
	}
	
	public void playMovie(String movieName)
	{
		startComputer();
		startWindows();
		movieStarter.openPlayer();
		movieStarter.addMovie(movieName);
		movieStarter.playMovie();
	}
 
	public void program(String workspace,String project)
	{
		startComputer();
		startWindows();
		eclipseStarter.chooseWorkspace(workspace);
		eclipseStarter.chooseProject(project);
	}
	private void startWindows()
	{
		windowsStarter.chooseLogin("Guest");
		windowsStarter.enterPassword();
		
	}

	private void startComputer() 
	{
		computerStarter.plugToPower();
		computerStarter.swtichOnUPS();
		computerStarter.switchOnCPU();
		computerStarter.switchOnMonitor();
	}

}

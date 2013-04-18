package pattern.design.facade.example;

public class MovieStarter {

	void openPlayer()
	{
		System.out.println("open VLC player");
	}
	
	void addMovie(String movieName)
	{
		System.out.println("Adding movie" + movieName);
	}
	void playMovie()
	{
		System.out.println("Playing");
	}
}

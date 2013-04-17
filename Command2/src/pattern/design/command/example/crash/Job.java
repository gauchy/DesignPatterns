package pattern.design.command.example.crash;

public interface Job 
{
	void execute();
	Status status();
	void setStatus(Status status);
}

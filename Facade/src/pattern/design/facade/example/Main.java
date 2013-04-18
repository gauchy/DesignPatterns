package pattern.design.facade.example;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FacadeStarter fs = new FacadeStarter();
		System.out.println("Play movie : Matrix---");
		fs.playMovie("Matrix");
		System.out.println("\n");
		System.out.println("Program : Facade pattern---");
		fs.program("dubby", "facade");
	}

}

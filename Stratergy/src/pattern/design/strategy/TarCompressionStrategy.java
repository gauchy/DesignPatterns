package pattern.design.strategy;

public class TarCompressionStrategy implements CompressionStartegy{

	@Override
	public void compress() 
	{
		System.out.println("Tar-ring the file");
	}

}

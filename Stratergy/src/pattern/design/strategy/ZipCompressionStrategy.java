package pattern.design.strategy;

public class ZipCompressionStrategy  implements CompressionStartegy{

	@Override
	public void compress() 
	{
		System.out.println("Zipping the file");
	}

}

package pattern.design.strategy;

public class CompressionContext 
{
	private CompressionStartegy compressionStartegy;
	CompressionContext(CompressionStartegy compressionStartegy)
	{
		this.compressionStartegy = compressionStartegy;
	}
	
	public void setCompressionStrategy(CompressionStartegy compressionStartegy)
	{
		this.compressionStartegy = compressionStartegy;
	}
	
	public void archive()
	{
		compressionStartegy.compress();
	}
	
}

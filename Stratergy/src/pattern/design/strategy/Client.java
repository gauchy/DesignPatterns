package pattern.design.strategy;

/**
 * Taken from Dzone
 * @author gauchy
 *
 */
public class Client {
	
	public static void main(String args[])
	{
		CompressionContext ctx = new CompressionContext(new ZipCompressionStrategy());
		ctx.archive();
	}
}

package rai.ashwini.observer;

public class Client 
{
	public static void main(String args[])
	{
		Father f = new Father();
		Mother m = new Mother();
		Son s = new Son();
		Daughter d = new Daughter();
		
		f.attachListener(m);
		f.attachListener(s);
		f.attachListener(d);
		
		f.giveHike();
	}
}

package Lamdademo;

public class RunableLambda
{
	public static void main(String[]args) throws InterruptedException
	{
		Runnable runnable=()->
		{
			System.out.println("exposure of java8 lambda in  detail");
		};
		Thread t1=new Thread(runnable);
		t1.start();
	}
}

class ThreadSleep extends Thread
 {
 	public void run()
 	{
 		for (int i=0;i<5 ;i++ ) {
 			try
 			{
 			System.out.println("Thread"+i);
 			Thread.sleep(500);
 		}
 		catch(InterruptedException e)
 		{
 			System.out.println(e);
 		}
 		}
 	}
	public static void main(String[] args) {
		ThreadSleep obj =	new ThreadSleep();
			
			obj.start();
			ThreadSleep obj1 =	new ThreadSleep();
			
			obj1.start();
		}	
}
class ThreadClass extends Thread
  {
  	public void run()
  	{
  		for (int i=1;i<5 ;i++ )
  		 {
  			System.out.println("Running"+i);	
  			
  		}
  	}
	public static void main(String[] args)
	 {
		ThreadClass obj=new ThreadClass();
		ThreadClass obj1=new ThreadClass();
		obj.start();
		
		obj1.start();
	}
	
}
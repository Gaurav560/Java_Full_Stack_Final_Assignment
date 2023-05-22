
package com.ineuron.ai;
public class Producer extends Thread {
	company c;
	public Producer(company c) {
		super();
		this.c = c;
	}
	@Override
	public void run() 
	{
		
		while (true) {
		try {
			this.c.produce_item();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			Thread.sleep(4000);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			
	
		}

	}

}

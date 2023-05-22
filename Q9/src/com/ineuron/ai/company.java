package com.ineuron.ai;

import java.util.ArrayList;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;



public class company {

	Integer rand;
	  
	boolean f = false;
Random random=new Random();
 static Queue<Integer> queue=new PriorityQueue<>();

	// f=false chance producer
	// f=true chance consumer
	synchronized public void produce_item() throws InterruptedException {
		if (f) {
			wait();
		}
		rand=random.nextInt(1000);
		queue.add(rand);

		System.out.println("integer produced "+ rand);
		f = true;
		notify();
	}

	synchronized public void consume_item() throws InterruptedException {
		Integer sum=0;
		if (!f) {
			wait();
		}
		

		 
		List<Integer> list=new ArrayList<>(queue);
		for (Integer integer : list) {
			sum=sum+integer;
		}
		System.out.println("integer consumed::"+sum);
     
        	
		
		f = false;
		notify();
		

	}
}

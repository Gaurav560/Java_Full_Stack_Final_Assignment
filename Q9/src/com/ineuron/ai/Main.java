

package com.ineuron.ai;

public class Main {

	public static void main(String[] args) {
		company company=new company();
	Producer p=new Producer(company);
	Consumer c=new Consumer(company);
	p.start();
	c.start();

	}

}



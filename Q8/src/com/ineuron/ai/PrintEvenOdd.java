package com.ineuron.ai; 


//even class 
class eventhread extends Thread
{
 public void run()
{
 for(int i=0;i<=10;i=i+2)
{
 System.out.println("Even no="+ i);
 }
}
}


//odd class 
class oddthread extends Thread
{
 public void run()
{ for(int i=1;i<=10;i=i+2)
 {
 System.out.println("Odd no="+ i);
 }
 }
 }



 class PrintEvenOdd
{
 public static void main(String args[]) {
 eventhread e1= new eventhread();
 oddthread o1= new oddthread();
 
 //starting thread execution 
e1.start(); 
o1.start();
}
}
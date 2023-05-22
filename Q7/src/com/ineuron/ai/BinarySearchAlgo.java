package com.ineuron.ai;

import java.util.Scanner;



class BinarySearchAlgo {
  int binarySearch(int array[], int element, int low, int high) {

  
    while (low <= high) {

    
      int mid = low + (high - low) / 2;

    
      if (array[mid] == element)
        return mid;

      
      if (array[mid] < element)
        low = mid + 1;

   
      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {

    // create an object of BinarySearchAlgo class
    BinarySearchAlgo obj = new BinarySearchAlgo();

    // sorted array
    int[] array = { 33,56,76,976,1234,75443367 };
    int n = array.length;


    Scanner input = new Scanner(System.in);

    System.out.println("Enter element to be searched:");

    // element to be searched
    int element = input.nextInt();
    input.close();


    int result = obj.binarySearch(array, element, 0, n - 1);
    if (result == -1)
      System.out.println("Oops !Elemet Not found");
    else
      System.out.println("Yay! Element found at index " + result);
  }
}
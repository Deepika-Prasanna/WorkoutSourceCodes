package com.deepu.general.workouts;

public class Main {
    public static void main(String[] args) {
    	
     Main main = new Main();
     
     System.out.println(main.add(2L,3));
  }
  
  long add(int a, long b){
    return  (a+b);
  }
  
  long add(long a, int b){
    return (a+b);
  }
}
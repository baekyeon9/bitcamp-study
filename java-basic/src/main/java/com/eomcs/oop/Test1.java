package com.eomcs.oop;

public class Test1 {

  public static void main(String[] args) {

    int sum =  0;

    for (int a  = 1; a <=  20; a++) {
      if(a%2 != 0  && a%3 != 0) {
        sum =  sum  + a;

        System.out.println(a + ",");
      }
    }
    System.out.println("총합="+sum);

  }
}

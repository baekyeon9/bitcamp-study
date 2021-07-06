package com.eomcs.lang.ex99;

public class Exam0130 {
  public static void main(String[] args) {
    java.util.Date today = new java.util.Date();

    System.out.printf("%1$tY, %1$ty\n", today); // Y연도 4자리 / y연도 2자리
    System.out.printf("%1$tB, %1$tb\n", today); 
    System.out.printf("%1$tm\n", today);

    System.out.printf("%1$td, %1$te\n", today);
    System.out.printf("%1$tA, %1$ta\n", today);
  }
}


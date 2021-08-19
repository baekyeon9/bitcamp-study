package com.eomcs.oop;

import java.util.Scanner;

class Test1 {
  public static void main(String[] args) {

    int num = 0;
    System.out.println("*을 출력할 라인 수를 입력하세요!> ");

    Scanner keyScan = new Scanner(System.in);
    String input = Integer.parseInt(keyScan.nextLine(num));


    for(int i = 1; i <= num; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    keyScan.close();
  }
}
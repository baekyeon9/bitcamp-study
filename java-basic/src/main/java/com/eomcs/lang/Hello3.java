package com.eomcs.lang;

import java.util.Scanner;

public class Hello3 {

  public static void main(String[] args) { 

    int score = 0;
    char grade = ' ';

    System.out.println("점수를 입력하세요> ");
    Scanner keyScan = new Scanner(System.in);
    score = keyScan.nextInt();

    if (score >= 90) {
      grade = 'A';

    } else if (score >= 80) {
      grade = 'B';

    } else if (score >= 70) {
      grade = 'C';

    } else {
      grade = 'D';
    }  
    System.out.println("당신의 학점은 "+ grade +" 입니다.");
  }
}

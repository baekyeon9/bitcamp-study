package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    String project = keyScan.nextLine();

    System.out.print("번호? ");
    int no = keyScan.nextInt();
    keyScan.nextLine();

    System.out.print("내용? ");
    String content = keyScan.nextLine();

    System.out.print("완료일?(yyyy-mm-dd) ");
    Date deadline = Date.valueOf(keyScan.nextLine());

    System.out.println("상태? ");
    System.out.println("0: 신규 ");
    System.out.println("1: 진행중 ");
    System.out.println("2: 완료 ");
    System.out.printf("> ");
    int status = Integer.valueOf(keyScan.nextLine());


    System.out.println("담당지? ");   
    String owner = keyScan.nextLine();

    keyScan.close();

    System.out.println("--------------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", deadline);

    switch(status) {
      case 1 : 
        System.out.println("상태: 진행중");
        break;
      case 2:
        System.out.println("상태: 완료");
      default:
        System.out.println("상태: 신규");

    }

    System.out.printf("담당자: %s\n", owner);


  }
}

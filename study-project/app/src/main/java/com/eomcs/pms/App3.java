package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    final int MAX_LENGTH = 100;

    String[] project = new String[MAX_LENGTH];
    int[] no = new int[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] deadline = new Date[MAX_LENGTH];
    int[] status = new int[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];
    int size = 0;

    System.out.println("[작업]");

    for (int i = 0; i < MAX_LENGTH; i++) {

      System.out.print("프로젝트? ");
      project[i] = keyScan.nextLine();

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyScan.nextLine());

      System.out.print("내용? ");
      content[i] = keyScan.nextLine();

      System.out.print("완료일?(yyyy-mm-dd) ");
      deadline[i] = Date.valueOf(keyScan.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규 ");
      System.out.println("1: 진행중 ");
      System.out.println("2: 완료 ");
      System.out.printf("> ");
      status[i] = Integer.valueOf(keyScan.nextLine());

      System.out.print("담당지? ");   
      owner[i] = keyScan.nextLine();

      size++;
      System.out.println();


      System.out.print("계속 입력하시겠습니까? ");
      String input = keyScan.nextLine();
      if (!input.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }

    keyScan.close();

    System.out.println("--------------------------------");

    System.out.println("[project]");

    for (int i = 0; i < size; i++) {

      String stateLabel = null;
      switch(status[i]) {
        case 1 : 
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }

      System.out.printf("%d, %s, %s, %d, %s\n", 
          no[i], project[i], deadline[i], stateLabel, owner[i]);

    }
  }
}

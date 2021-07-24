package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");
    Scanner keyScan = new Scanner(System.in);

    final int MAX_LENGTH = 100;

    int[] no = new int[MAX_LENGTH] ;
    String[] title = new String[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] startDate = new Date[MAX_LENGTH];
    Date[] endDate = new Date[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];    
    String[] members = new String[MAX_LENGTH];

    int size = 0;

    for(int i = 0; i < MAX_LENGTH; i++) {

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyScan.nextLine());
      System.out.print("프로젝트명? ");
      title[i] = keyScan.nextLine();
      System.out.print("내용? ");
      content[i] = keyScan.nextLine();
      System.out.print("시작일?(yyyy-mm-dd) ");
      startDate[i] = Date.valueOf(keyScan.nextLine());
      System.out.print("종료일?(yyyy-mm-dd) ");
      endDate[i] = Date.valueOf(keyScan.nextLine());
      System.out.print("만든이? ");
      owner[i] = keyScan.nextLine();
      System.out.print("팀원? ");
      members[i] = keyScan.nextLine();

      size++;
      System.out.println();

      System.out.println("계속 입력하시겠습니까?");
      String input = keyScan.nextLine();
      if (input.equalsIgnoreCase("n") || input.length()==0) {
        break;
      }
      System.out.println();
    }

    keyScan.close();

    System.out.println("--------------------------------");


    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i],
          title[i],
          startDate[i],
          endDate[i],
          owner[i]);
    }
  }
}

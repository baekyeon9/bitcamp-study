package com.eomcs.pms;

import java.sql.Date;

public class TaskHandler {

  static final int TMAX_LENGTH = 100;
  static String[] title = new String[TMAX_LENGTH];
  static int[] no = new int[TMAX_LENGTH];
  static String[] content = new String[TMAX_LENGTH];
  static Date[] deadline = new Date[TMAX_LENGTH];
  static int[] status = new int[TMAX_LENGTH];
  static String[] owner = new String[TMAX_LENGTH];
  static int size = 0;


  static void addTask() {
    System.out.println("[작업 등록]");     

    no[size] = Prompt.inputInt("번호? ");

    title[size] = Prompt.inputString("프로젝트명? ");

    content[size] = Prompt.inputString("내용? ");

    deadline[size] = Prompt.inputDate("완료일?(yyyy-mm-dd) ");

    System.out.println("상태? ");
    System.out.println("0: 신규 ");
    System.out.println("1: 진행중 ");
    System.out.println("2: 완료 ");
    System.out.printf("> ");

    status[size] = Prompt.inputInt("> ");

    owner[size] = Prompt.inputString("담당자");
    size++;
  }

  static void listTasks() {
    System.out.println("[작업 목록]");
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
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], title[i], deadline[i], stateLabel, owner[i]);
    }
  }

}

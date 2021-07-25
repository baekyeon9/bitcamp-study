package com.eomcs.pms;

import java.sql.Date;

public class App {



  static final int PMAX_LENGTH = 100;
  static int[] pNo = new int[PMAX_LENGTH] ;
  static String[] pTitle = new String[PMAX_LENGTH];
  static String[] pContent = new String[PMAX_LENGTH];
  static Date[] pStartDate = new Date[PMAX_LENGTH];
  static Date[] pEndDate = new Date[PMAX_LENGTH];
  static String[] pOwner = new String[PMAX_LENGTH];    
  static String[] pMembers = new String[PMAX_LENGTH];
  static int pSize = 0;

  static final int TMAX_LENGTH = 100;
  static String[] tTitle = new String[TMAX_LENGTH];
  static int[] tNo = new int[TMAX_LENGTH];
  static String[] tContent = new String[TMAX_LENGTH];
  static Date[] tDeadline = new Date[TMAX_LENGTH];
  static int[] tStatus = new int[TMAX_LENGTH];
  static String[] tOwner = new String[TMAX_LENGTH];
  static int tSize = 0;


  public static void main(String[] args) {

    while(true) {
      String input = Prompt.inputString("명령> ");

      if(input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;

      } else if(input.equals("/member/add")) {
        MemberHandler.addMember();

      } else if(input.equals("/member/list")) {
        MemberHandler.listMembers();

      } else if(input.equals("/project/add")) {
        addProject();

      } else if(input.equals("/project/list")) {
        listProjects();

      } else if(input.equals("/task/add")) {
        addTask();

      } else if(input.equals("/task/list")) {
        listTasks();

      } else {
        System.out.println("실행할 수 없는 명령입니다.");  
      }

      System.out.println();
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    pNo[pSize] = Prompt.inputInt("번호? ");

    pTitle[pSize] = Prompt.inputString("프로젝트명? ");

    pContent[pSize] = Prompt.inputString("내용? ");

    pStartDate[pSize] = Prompt.inputDate("시작일?(yyyy-mm-dd) ");

    pEndDate[pSize] = Prompt.inputDate("종료일?(yyyy-mm-dd) ");

    pOwner[pSize] = Prompt.inputString("만든이? ");

    pMembers[pSize] = Prompt.inputString("팀원? ");

    pSize++;
  }

  static void listProjects() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < pSize; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          pNo[i], pTitle[i], pStartDate[i], pEndDate[i], pOwner[i]);
    }
  }
  static void addTask() {
    System.out.println("[작업 등록]");     

    tNo[tSize] = Prompt.inputInt("번호? ");

    tTitle[tSize] = Prompt.inputString("프로젝트명? ");

    tContent[tSize] = Prompt.inputString("내용? ");

    tDeadline[tSize] = Prompt.inputDate("완료일?(yyyy-mm-dd) ");

    System.out.println("상태? ");
    System.out.println("0: 신규 ");
    System.out.println("1: 진행중 ");
    System.out.println("2: 완료 ");
    System.out.printf("> ");

    tStatus[tSize] = Prompt.inputInt("> ");

    tOwner[tSize] = Prompt.inputString("담당자");
    tSize++;
  }

  static void listTasks() {
    System.out.println("[작업 목록]");
    for (int i = 0; i < tSize; i++) {
      String stateLabel = null;
      switch(tStatus[i]) {
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
          tNo[i], tTitle[i], tDeadline[i], stateLabel, tOwner[i]);
    }
  }


}


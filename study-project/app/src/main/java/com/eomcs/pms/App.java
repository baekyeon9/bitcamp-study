package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyScan = new Scanner(System.in);

  static final int MAX_LENGTH = 100;
  static int[] no = new int[MAX_LENGTH];
  static String[] name = new String[MAX_LENGTH];
  static String[] email = new String[MAX_LENGTH];
  static String[] password = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static String[] tel = new String[MAX_LENGTH];
  static Date[] registeredDate = new Date[MAX_LENGTH];
  static int size = 0;

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

  static String input; //사용자가 입력한 값을 보관하는 변수


  public static void main(String[] args) {

    while(true) {
      prompt();

      if(input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;

      } else if(input.equals("/member/add")) {
        addMember();

      } else if(input.equals("/member/list")) {
        listMembers();

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
  static void addMember() {
    System.out.println("[회원 등록]");
    System.out.print("번호? ");
    no[size] = Integer.parseInt(keyScan.nextLine());

    System.out.print("이름? ");
    name[size] = keyScan.nextLine();

    System.out.print("이메일? ");
    email[size] = keyScan.nextLine();

    System.out.print("암호? ");
    password[size] = keyScan.nextLine();

    System.out.print("사진? ");
    photo[size] = keyScan.nextLine();

    System.out.print("전화? ");
    tel[size] = keyScan.nextLine();

    registeredDate[size] = new Date(System.currentTimeMillis());

    size++;
  }

  static void listMembers() {
    System.out.println("[회원 목록]");
    for (int i = 0; i  < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  } 
  static void addProject() {
    System.out.println("[프로젝트 등록]");
    System.out.print("번호? ");
    pNo[pSize] = Integer.parseInt(keyScan.nextLine());
    System.out.print("프로젝트명? ");
    pTitle[pSize] = keyScan.nextLine();
    System.out.print("내용? ");
    pContent[pSize] = keyScan.nextLine();
    System.out.print("시작일?(yyyy-mm-dd) ");
    pStartDate[pSize] = Date.valueOf(keyScan.nextLine());
    System.out.print("종료일?(yyyy-mm-dd) ");
    pEndDate[pSize] = Date.valueOf(keyScan.nextLine());
    System.out.print("만든이? ");
    pOwner[pSize] = keyScan.nextLine();
    System.out.print("팀원? ");
    pMembers[pSize] = keyScan.nextLine();
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

    System.out.print("번호? ");
    tNo[tSize] = Integer.parseInt(keyScan.nextLine());
    System.out.print("프로젝트명? ");
    tTitle[tSize] = keyScan.nextLine();
    System.out.print("내용? ");
    tContent[tSize] = keyScan.nextLine();
    System.out.print("완료일?(yyyy-mm-dd) ");
    tDeadline[tSize] = Date.valueOf(keyScan.nextLine());
    System.out.println("상태? ");
    System.out.println("0: 신규 ");
    System.out.println("1: 진행중 ");
    System.out.println("2: 완료 ");
    System.out.printf("> ");
    tStatus[tSize] = Integer.valueOf(keyScan.nextLine());
    System.out.print("담당지? ");   
    tOwner[tSize] = keyScan.nextLine();
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

  static void prompt() {
    System.out.print("명령> ");
    input = keyScan.nextLine();

  }
}


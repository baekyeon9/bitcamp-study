package com.eomcs.pms;

import java.sql.Date;

public class ProjectHandler {

  static final int PROJECT_LENGTH = 100;
  static int[] pNo = new int[PROJECT_LENGTH];
  static String[] pTitle = new String[PROJECT_LENGTH];
  static String[] pContent = new String[PROJECT_LENGTH];
  static Date[] pStartDate = new Date[PROJECT_LENGTH];
  static Date[] pEndDate = new Date[PROJECT_LENGTH];
  static String[] pOwner = new String[PROJECT_LENGTH];
  static String[] pMember = new String[PROJECT_LENGTH];
  static int pSize = 0;

  static void add() {
    System.out.println("[프로젝트 등록]");

    pNo[pSize] = Prompt.inputtInt("번호? ");
    pTitle[pSize] = Prompt.inputString("프로젝트명? ");
    pContent[pSize] = Prompt.inputString("내용? ");
    pStartDate[pSize] = Prompt.InputDate("시작일? (yyyy-mm-dd)");
    pEndDate[pSize] = Prompt.InputDate("종료일? (yyyy-mm-dd)");
    pOwner[pSize] = Prompt.inputString("만든이? ");
    pMember[pSize] = Prompt.inputString("팀원? ");
    pSize++;
  }

  static void list() {
    System.out.println("[프로젝트 목록]");
    for(int i = 0; i < pSize; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s", 
          pNo[i],
          pTitle[i],
          pContent[i],
          pStartDate[i],
          pEndDate[i],
          pOwner[i],
          pMember[i]);
    }  
  }

}

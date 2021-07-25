package com.eomcs.pms;

import java.sql.Date;

public class ProjectHandler {

  static final int PMAX_LENGTH = 100;
  static int[] no = new int[PMAX_LENGTH] ;
  static String[] title = new String[PMAX_LENGTH];
  static String[] content = new String[PMAX_LENGTH];
  static Date[] startDate = new Date[PMAX_LENGTH];
  static Date[] endDate = new Date[PMAX_LENGTH];
  static String[] owner = new String[PMAX_LENGTH];    
  static String[] members = new String[PMAX_LENGTH];
  static int size = 0;

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    no[size] = Prompt.inputInt("번호? ");

    title[size] = Prompt.inputString("프로젝트명? ");

    content[size] = Prompt.inputString("내용? ");

    startDate[size] = Prompt.inputDate("시작일?(yyyy-mm-dd) ");

    endDate[size] = Prompt.inputDate("종료일?(yyyy-mm-dd) ");

    owner[size] = Prompt.inputString("만든이? ");

    members[size] = Prompt.inputString("팀원? ");

    size++;
  }

  static void listProjects() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }

}

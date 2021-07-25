package com.eomcs.pms;

import java.sql.Date;

public class MemberHandler {

  static final int MAX_LENGTH = 100;
  static int[] no = new int[MAX_LENGTH];
  static String[] name = new String[MAX_LENGTH];
  static String[] email = new String[MAX_LENGTH];
  static String[] password = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static String[] tel = new String[MAX_LENGTH];
  static Date[] registeredDate = new Date[MAX_LENGTH];
  static int size = 0;

  static void addMember() {
    System.out.println("[회원 등록]");

    no[size] = Prompt.inputInt("번호? ");

    name[size] = Prompt.inputString("이름? ");

    email[size] = Prompt.inputString("이메일? ");

    password[size] = Prompt.inputString("암호? ");

    photo[size] = Prompt.inputString("사진? ");

    tel[size] = Prompt.inputString("전화? ");

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

}

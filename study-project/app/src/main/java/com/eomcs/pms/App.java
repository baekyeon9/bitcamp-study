package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH = 100;

    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];

    Scanner keyScan = new Scanner(System.in);

    int size = 0;

    for(int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyScan.nextLine());
      System.out.print("이름? ");
      name[i] = keyScan.nextLine();
      System.out.print("이메일? ");
      email[i] = keyScan.nextLine();
      System.out.print("암호? ");
      password[i] = keyScan.nextLine();
      System.out.print("사진? ");
      photo[i] = keyScan.nextLine();
      System.out.print("전화? ");
      tel[i] = keyScan.nextLine();
      registeredDate[0] = new Date();

      size++;

      System.out.print("계속 입력하시겠습니까? (y/N)");
      String input = keyScan.nextLine();
      if (input.equalsIgnoreCase("n") || input.length()==0) {
        break;
      }
    }
    keyScan.close();
    System.out.println();

    System.out.println("--------------------------------");  

    System.out.println("[회원]");

    for (int i=0; i  <size; i++) {

      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td",
          no[i], 
          name[i], 
          email[i], 
          tel[i], 
          registeredDate[i]);


    }
  }
}
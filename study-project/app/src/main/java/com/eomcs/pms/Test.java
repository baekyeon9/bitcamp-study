package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int LENGTH = 100;

    int[] no = new int [LENGTH];
    String[] name = new String [LENGTH];    
    String[] email = new String [LENGTH];
    String[] password = new String [LENGTH];
    String[] photo = new String [LENGTH];
    String[] tel = new String [LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    Scanner keyboardScan = new Scanner(System.in);    

    int size = 0;
    for (int i = 0; i < LENGTH; i++) {
      System.out.println("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.println("이름? ");
      name[i] = keyboardScan.nextLine();
      System.out.println("이메일? ");
      email[i] = keyboardScan.nextLine();
      System.out.println("암호? ");
      password[i] = keyboardScan.nextLine();
      System.out.println("사진? ");
      photo[i] = keyboardScan.nextLine();
      System.out.println("전화? ");
      tel[i] = keyboardScan.nextLine();
      registeredDate[i] = new Date(System.currentTimeMillis());
      System.out.println();

      size++;

      System.out.println("계속 입력 하시겠습니까?(y/N)");
      String input = keyboardScan.nextLine();
      if (!input.equalsIgnoreCase("y")) {
        break;
      }

    }



    keyboardScan.close();

    System.out.println("------------------------");

    for (int i = 0; i < size; i++) {

      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n",
          no[i], 
          name[i], 
          email[i], 
          tel[i], 
          registeredDate[i]);


    }


  }
}


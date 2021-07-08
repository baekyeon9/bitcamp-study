package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;


public class Test {

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH = 2;

    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];

    Scanner keyboardScan = new Scanner(System.in);

    int size = 0;

    for(int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();
      System.out.print("이메일? "); 
      email[i] = keyboardScan.nextLine();
      System.out.print("암호? "); 
      password[i] = keyboardScan.nextLine();
      System.out.print("사진? "); 
      photo[i] = keyboardScan.nextLine();
      System.out.print("전화? "); 
      tel[i] = keyboardScan.nextLine();
      registeredDate[i] = new Date();
      size = size +1;
      System.out.println();     

      System.out.println("계속 입력하시겠습니까? (y/N)");
      String input = keyboardScan.nextLine();
      if (input.equalsIgnoreCase("N")|| input.equals("")) {
        break;
      }
    }


    keyboardScan.close();

    System.out.println("--------------------------------");


    for(int i = 0; i < size; i++) {
      System.out.println("번호: " + no[i]);
      System.out.println("이름: " + name[i]);
      System.out.println("이메일: " + email[i]);
      System.out.printf("암호: %s\n", password[i]);
      System.out.printf("사진: %s\n", photo[i]);
      System.out.printf("전화: %s\n", tel[i]);
      System.out.printf("가입일: %tY-%1$tm-%1$td\n", registeredDate[i]);
    }
  }

}


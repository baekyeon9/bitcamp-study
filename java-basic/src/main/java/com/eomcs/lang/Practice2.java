package com.eomcs.lang;

import java.util.Date;
import java.util.Scanner;

public class Practice2 {
  public static void main(String[] args) {

    System.out.println("[회원]");

    int[] no = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] photo = new String[5];
    String[] tel = new String[5];    
    Date[] registeredDate= new Date[5];

    Scanner keyboardScan = new Scanner(System.in);

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
    registeredDate[0] = new Date();
    System.out.println();

    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());


    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    for (int i =0; i<no.length; i++)

      System.out.println("--------------------------------");

    System.out.println("번호: " + no[i]);
    System.out.println("이름: " + name[i]);
    System.out.println("이메일: " + email[i]);
    System.out.printf("암호: %s\n", password[i]);
    System.out.printf("사진: %s\n", photo[i]);
    System.out.printf("전화: %s\n", tel[i]);
    System.out.printf("가입일: %s\n", registeredDate[i]);


  }
}
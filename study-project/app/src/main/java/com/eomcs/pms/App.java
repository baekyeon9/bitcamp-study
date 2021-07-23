package com.eomcs.pms;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    System.out.println("[회원]");

    System.out.println("번호? ");
    String no = keyScan.nextLine();

    System.out.println("이름? ");
    String name = keyScan.nextLine();

    System.out.println("이메일? ");
    String email = keyScan.nextLine();

    System.out.println("암호? ");
    String password = keyScan.nextLine();

    System.out.println("사진? ");
    String photo = keyScan.nextLine();

    System.out.println("전화? ");
    String tel = keyScan.nextLine();

    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());

    System.out.println("계속 입력하시겠습니까? (y/N)");
    String input = keyScan.nextLine();

    if (input.equalsIgnoreCase("N") || input.equals("")) {
      break;
    }

    keyScan.close();

    System.out.println("--------------------------------");  

    System.out.println("[회원]");

    System.out.println("번호: " + no);
    System.out.println("이름: " + name);
    System.out.println("이메일: " + email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", now);
  }
}

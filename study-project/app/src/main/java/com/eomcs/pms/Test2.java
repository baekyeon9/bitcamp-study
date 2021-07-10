package com.eomcs.pms;

public class Test2 {

  public static void main(String[] args) {


    java.util.Date d = new java.util.Date();
    System.out.println(d.toString());
    System.out.printf("%tY-%tm-%td\n", d, d, d);
    System.out.printf("%tY-%1$tm-%1$td", d);

    /*
     * java.util.Date d = new java.util.Date(); // Date 객체를 만드는 순간의 시각을 저장해 둔다.
     * System.out.println(d.toString()); System.out.printf("%tY-%tm-%td\n", d, d, d);
     * System.out.printf("%tY-%1$tm-%1$td\n", d);
     */

  }
}



System.out.print("번호? ");
no[i] = Integer.parseInt(keyboardScan.nextLine()); 

System.out.print("프로젝트명? ");
title[i] = keyboardScan.nextLine();

System.out.print("내용? ");
content[i] = keyboardScan.nextLine();

System.out.print("시작일? ");
startDate[i] = Date.valueOf(keyboardScan.nextLine());

System.out.print("종료일? ");
endDate[i] = Date.valueOf(keyboardScan.nextLine());

System.out.print("만든이? ");
owner[i] = keyboardScan.nextLine();

System.out.print("팀원? ");
members[i] = keyboardScan.nextLine();

size++;
System.out.println();

System.out.print("계속 입력하시겠습니까?(y/N)");
String input = keyboardScan.nextLine();
if (input.equalsIgnoreCase("N") || input.equals(""));{
  break;
}
System.out.println();
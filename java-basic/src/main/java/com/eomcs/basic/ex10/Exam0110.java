package com.eomcs.basic.ex10;

public class Exam0110 {
  public static void main(String[] args) { 

    java.util.Date d = new java.util.Date();  // Date 객체를 만드는 순간의 시각을 저장해 둔다.
    System.out.println(d.toString()); 
    System.out.printf("%tY-%tm-%td\n", d, d, d);
    System.out.printf("%tY-%1$tm-%1$td", d);

  } 
}

// new java.sql.Date(밀리초)
// java.sql.Date.valueof(날짜문자열) - 형식 yyyy-mm-dd
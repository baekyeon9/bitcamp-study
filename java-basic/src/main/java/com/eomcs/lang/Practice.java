package com.eomcs.lang;

public class Practice {

  public static void main(String[] args) {
    java.util.Scanner keyboardScanner = new java.util.Scanner(System.in);

    System.out.print("int: ");
    int i = keyboardScanner.nextInt();

    System.out.print("float: ");
    float f = keyboardScanner.nextFloat();

    System.out.print("boolean: ");
    boolean b = keyboardScanner.nextBoolean();

    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());

    keyboardScanner.close();

    System.out.printf("날짜 :\n", now);
    System.out.printf("%d, %f, %b", i, f, b);



  }
}
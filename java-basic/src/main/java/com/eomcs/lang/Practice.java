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

    //    int[] arr1; 
    //    arr1 = new int[5];
    //    arr1[0] = 100;
    //    arr1[1] = 90;
    //    arr1[2] = 80;
    //    arr1[3] = 70;
    //    arr1[4] = 60;
    //
    //    int sum2 = 0;
    //
    //    for(int i = 0; i < arr1.length; i++) {
    //      sum2 = sum2 + arr1[i];
    //    }
    //
    //    System.out.println(sum2);
  }
}
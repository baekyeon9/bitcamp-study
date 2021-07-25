package com.eomcs.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {

  static Scanner keyScan = new Scanner(System.in);

  public static String inputString(String title) {
    System.out.print(title);
    return keyScan.nextLine();
  }

  public static int inputInt(String title) {
    System.out.print(title);
    return Integer.parseInt(keyScan.nextLine());
  }

  public static Date inputDate(String title) {
    System.out.print(title);
    return Date.valueOf(keyScan.nextLine());
  }
  public static void close() {
    keyScan.close();
  }
}

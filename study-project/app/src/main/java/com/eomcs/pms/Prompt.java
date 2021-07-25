package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {

  static Scanner keyScan = new Scanner(System.in);

  static String inputString(String title) {
    System.out.print(title);
    return keyScan.nextLine();
  }

  static int inputInt(String title) {
    System.out.print(title);
    return Integer.parseInt(keyScan.nextLine());
  }

  static Date inputDate(String title) {
    System.out.print(title);
    return Date.valueOf(keyScan.nextLine());
  }
  static void close() {
    keyScan.close();
  }
}

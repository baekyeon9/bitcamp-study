package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {

  static Scanner keyScan= new Scanner(System.in);

  static String inputString(String title) {
    System.out.print(title);
    return keyScan.nextLine();
  }  
  static int inputtInt(String title) {
    return Integer.parseInt(inputString(title));  
  }
  static Date InputDate(String title) {
    return Date.valueOf(inputString(title));
  }

  static void close() {
    keyScan.close();
  }

}

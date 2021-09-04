package com.eomcs.menu;

public abstract class Menu {

  public static final int ACCESS_LOGOUT = 0x01;  // 0001
  public static final int ACCESS_GENERAL = 0x02; // 0010
  public static final int ACCESS_ADMIN = 0x04;   // 0100

  String title;

  int accessScope;

  public Menu(String title) {
    this(title, ACCESS_LOGOUT | ACCESS_GENERAL | ACCESS_ADMIN);
  }

  public Menu(String title, int accessScope) {
    this.title = title; // 메뉴 이름 설정은 기존 생성자를 통해 처리한다.
    this.accessScope = accessScope;
  }

  public abstract void execute();
}

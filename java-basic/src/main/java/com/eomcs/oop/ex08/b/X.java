<<<<<<< HEAD
=======


>>>>>>> 973244ccf7032bdd2a5f5a5256acca247b26e4d9
package com.eomcs.oop.ex08.b;

public class X {
  private int privateVar;
  int defaultVar;
  protected int protectedVar;
  public int publicVar;

<<<<<<< HEAD
  public void test() {
=======
<<<<<<< HEAD
  private void privateMethod() {}
  void defaultMethod() {}
  protected void protectedMethod() {}
  public void publicMethod() {}

  public void test() {
    // 같은 클래스의 멤버(필드나 메서드)인 경우 제한없이 모든 멤버에 접근할 수 있다.
    this.privateVar = 100;
    this.defaultVar = 100;
    this.protectedVar = 100;
    this.publicVar = 100;

    this.privateMethod();
    this.defaultMethod();
    this.protectedMethod();
    this.publicMethod();
=======
  public void ｔｅｓｔ() {
>>>>>>> aea66dca5fd0d50ebc05ed4d5b8a7603394648a8
    // 같은 클래스의 멤버인 경우 제한 없이 모든 멤버에 접근할 수 있다.
    this.privateVar 
>>>>>>> 973244ccf7032bdd2a5f5a5256acca247b26e4d9
  }
}
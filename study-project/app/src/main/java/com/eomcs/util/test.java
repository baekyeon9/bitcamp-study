package com.eomcs.util;

class Outer {

  static class Inner {
    int iv = 200;
  }
}

class test { 

  public static void main(String[] args) {
    Outer.Inner b  = new Outer.Inner();
    System.out.println(b.iv);

  }
}
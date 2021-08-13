// inner class : 바깥 클래스의 인스턴스 멤버에 접근하기
package com.eomcs.oop.ex11.c;

class B3 {

  // 인스턴스 멤버
  int v1 = 10;

  class X {
    int v1 = 100;

    void test() {
      int v1 = 1000;

      System.out.printf("v1 = %d\n", v1); // => test() 메서드의 로컬 변수를 가리킨다.
      System.out.printf("this.v1 = %d\n", this.v1); // => this.v3 : X 클래스의 인스턴스 변수를 가리킨다.
      System.out.printf("B3.this.v1 = %d\n", B3.this.v1); // => B.this.v4 : 바깥 클래스 B의 인스턴스 변수를 가리킨다.

      // => inner class 의 가장 큰 특징은 바깥 클래스의 다른 멤버에 손쉽게 접근할 수 있다는 것이다.
      // => 이것이 가능한 이유는 바깥 클래스의 인스턴스 멤버이기 때문이다.
    }
  }
}

public class Exam0230 {

  public static void main(String[] args) {
    B3 outer = new B3();
    outer.v1 = 11;

    B3.X x1 = outer.new X();
    x1.test();
    System.out.println("-------------------------");


    B3.X x2 = outer.new X();
    x2.test();
    System.out.println("-------------------------");

    B3 outer2 = new B3();
    outer2.v1 = 22;

    B3.X x3 = outer.new X();
    x3.test();
    System.out.println("-------------------------");

  }

}

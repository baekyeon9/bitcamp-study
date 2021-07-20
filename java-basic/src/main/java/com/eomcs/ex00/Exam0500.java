package com.eomcs.ex00;

public class Exam0500 {

  static class Calculator {

    int result = 0;

    void plus(int value) {
      this.result += value;
    }

    void minus(int value) {
      this.result -= value;
    }

    void multiple(int value) {
      this.result *= value;
    }

    void divide(int value) {
      this.result /= value;
    }

    static int abs(int a) {

      return a >= 0 ? a : a * -1;
    }
  }

  public static void main(String[] args) {


    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    c1.plus(2);
    c1.plus(3);    
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    Calculator.plus(c1, 3); 
    Calculator.multiple(c2, 2);
    Calculator.plus(c2, 7);
    Calculator.divide(c2, 4);
    Calculator.minus(c2, 5);   

    System.out.printf("result = %d\n", c1.result);
    System.out.printf("result = %d\n", c2.result);

  }

}
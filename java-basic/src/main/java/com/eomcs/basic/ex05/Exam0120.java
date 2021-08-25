// Stack 클래스 사용법 - empty()
package com.eomcs.basic.ex05;

import java.util.Stack;

public class Exam0120 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    while (!stack.empty()) { // 비어있는거 아니지? 비어있지 않으면 반복해서 꺼내~
      System.out.println(stack.pop());
    }
  }

}


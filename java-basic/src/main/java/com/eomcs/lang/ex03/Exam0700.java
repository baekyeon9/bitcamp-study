package com.eomcs.lang.ex03;

//# 이스케이프 문자(escape character) = 문자 제어 코드
// - 화면에 출력하는 문자가 아니라 문자 출력을 제어하는 문자이다.
// - 제어문자
// \n Line Feed (LF), 0x0a
// \r Carriage Return(CR), 0x0b
// \t Tab, 0x09
// \b Backspace, 0x08
// \ ' Single Quote, 0x27
// \ " Double Quote, 0x22
// \\ Backslash, 0x5c
//
//
public class Exam0700 {
  public static void main(String[] args) {
    System.out.println("Hello, world");
    System.out.println("Hello, \nworld"); // \n 줄바꿈 문자
    System.out.println("Hello, \rabc"); // \r Carriage Return 커서를 처음으로

    System.out.println("Hello, \b\b\bworld");// \b 커서를 뒤로 한 칸 이동시키는 문자
    System.out.println("Hello, \tworld"); // \t 탭 공간을 추가시키는 문자

    System.out.println("Hello,\"w\"orld"); // " 문자를 출력시키는 문자
    System.out.println("Hello, 'w'orld"); // "" 안에서 '문자는 그냥 적는다
    System.out.println('\''); // '문자를 출력시키는 문자 \'
    System.out.println('"'); // '' 안에서 "는 그냥 적는다
    System.out.println("c:\\Users\\user\\git"); // \문자를 출력시키는 문자

  }
}
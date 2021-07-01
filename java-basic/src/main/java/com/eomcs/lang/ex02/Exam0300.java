package com.eomcs.lang.ex02;

//# 주석 - 애노테이션(annotation)
//- 클래스, 변수(필드, 아규먼트, 로컬 변수), 메서드 선언에 붙이는 주석이다.
//- 컴파일러나 JVM에서 사용할 주석이다.
//- 컴파일 한 후에도 클래스 파일(.class)에 주석을 유지할 수 있다.
//- 클래스 파일을 메모리에 로딩할 때 주석도 함께 로딩할 수 있다.
//- 실행 중에 클래스와 함께 로딩된 주석을 추출할 수 있다.
//- '프로퍼티=값' 형태로 값을 설정한다.
//
//## 애노테이션 문법
//- 작성 방법
//  @애노테이션명(프로퍼티명=값,프로퍼티명=값,...)
//  예1) @Override
//  예2) @SuppressWarnings(value="deprecation")
//  예3) @SuppressWarnings(value={"unchecked", "deprecation"})
//

public class Exam0300 {
  public static void main(String[] args) {
    System.out.println("애노테이션");
  }
  
  //## @Override 
  //- 수퍼 클래스에서 상속 받은 멤버를 재정의 한다는 것을 컴파일러에게 알린다.
  //- 컴파일러는 오버라이딩 규칙을 준수하는지 검사한다.
  //- 만약 오버라이딩 규칙을 따르지 않는다면 컴파일 오류를 발생시킬 것이다.
  //
  @Override
  public String toString() {
    return "Exam12";
  }
}
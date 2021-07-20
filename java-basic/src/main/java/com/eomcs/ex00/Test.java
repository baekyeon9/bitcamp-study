package com.eomcs.ex00;

public class Test {
  static int a;
  // 클래스변수 - 클래스 로딩될 때 메서드 area에 딱 1번 만들어짐

  int b;
  // 인스턴스 변수 - Heap영역에
  //              new라는 명령어 실행 시마다 생성
  //              가비지가 된 후 가비지 컬렉터가 수집할 때 제거    
  // * 인스턴스마다 구분해서 관리해야 할 데이터를 저장



  void m(int c) {
    int d = c + 100;
  }
} //로컬변수 - 메서드가 호출되고 실행될 때

package com.eomcs.ex00;

public class Exam0600 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {

    Score s = creatScore("홍길동", 100, 100, 100);

    printScore(s);
  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng  + s.math;
    s.aver = s.sum / 3;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", 
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

  // 클래스를 이용하면 성적 정보를 하나로 묶어 리턴할 수 있다.
  // - Score 인스턴스를 생성하여 리턴한다.
  // - 더 정확하게 표현하면, Score 인스턴스를 생성한 후 그 주소를 리턴한다.

  static Score creatScore(String name, int kor, int eng, int math) {
    Score s = new Score();

    s.name = "홍길동"; // s에 저장된 주소로 찾아가서 name 항목에 값 저장
    s.kor = 100; // s에 저장된 주소로 찾아가서 kor 항목에 값 저장
    s.eng = 90;
    s.math = 80;

    return s; // s에 저장된 인스턴스의 주소를 리턴한다.

  }   



}




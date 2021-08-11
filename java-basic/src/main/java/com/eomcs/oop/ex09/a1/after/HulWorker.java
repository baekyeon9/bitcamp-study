package com.eomcs.oop.ex09.a1.after;


// 클래스를 정의할 때 worker 인터페이스를 구현하겠다고 선언하지는 않았지만
// Worker 인터페이스에 존재하는 메서드를 모두 구현했을 때,
// 이 클래스는 Woker 규칙을 따른다고 할 수 있는가?
// 답: 

public class HulWorker {
  public void execute() {
    System.out.println("헐....^^");
  }
}

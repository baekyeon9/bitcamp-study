package com.eomcs.pms;

//1) 회원 데이터를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => addMember() 메서드 정의 및 회원 등록 코드를 가져오기

public class App {

  public static void main(String[] args) {

    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;

      } else if (input.equals("/member/add")) {
        MemberHandler.add();

      } else if (input.equals("/member/list")) {
        MemberHandler.list();

      }  else if (input.equals("/project/add")) {
        ProjectHandler.add();

      }  else if (input.equals("/project/list")) {
        ProjectHandler.list();

      }  else if (input.equals("/task/add")) {
        TaskHandler.add();

      }  else if (input.equals("/task/list")) {
        TaskHandler.list();

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    Prompt.keyboardScan.close();
  }




}

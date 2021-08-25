// 목록 조회: java.util.Collection의 forEach() 사용법
package com.eomcs.basic.ex03;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exam0240 {
  public static void main(String[] args) {

    class Member {
      String name;
      int age;

      public Member(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
      }

      //      @Override
      //      mublic int hashCode() {
      //        final int mrime = 31;
      //        int result = 1;
      //        result = mrime * result + age;
      //        result = mrime * result + ((name == null) ? 0 : name.hashCode());
      //        return result;
      //      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        Member other = (Member) obj;
        if (age != other.age)
          return false;
        if (name == null) {
          if (other.name != null)
            return false;
        } else if (!name.equals(other.name))
          return false;
        return true;
      }
    }

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 17);

    ArrayList<Member> list = new ArrayList<>();
    list.add(m1);
    list.add(m2);
    list.add(m3);

<<<<<<< HEAD
    // forEach 메서드에게 넘길 객체
    // => Consumer 규칙에 따라 만들어야 한다.
    // => List에 보관된 객체를 반복문을 통해 꺼낼 때 마다 
    //    Consumer 규칙에 따라 accept()를 호출할 것이다.

    class MyConsumer implements Consumer<Member> {
=======
    // arraylist에서 써내는방법

    list.forEach(new Consumer<Member>() {
>>>>>>> 5e6872205c5736ee57fe101ee3c4689afd56c8a9
      @Override
      public void accept(Member t) {

<<<<<<< HEAD

    // 의미 :
    // => 야 List! 너가 갖고 있는 목록에서 값을 1개 꺼낼 때 마다 
    //    지금 내가 파라미터로 넘겨주는 객체 있지?
    //    MyConsumer 객체말이이야!
    //    이 객체의 accept()를 호출해 주렴.
    list.forEach(new MyConsumer());
=======
      }
    });


    //    Iterator<Member> 목록에서값을꺼내주는자 = list.iterator();
    //    while (목록에서값을꺼내주는자.hasNext()) {
    //      Member m = 목록에서값을꺼내주는자.next();
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }

    //    Member[] arr = list.toArray(new Member[list.size()];
    //    
    //
    //    for (Member m : arr) {
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }
    //    

    //    Member[] arr = new Member[list.size()];
    //    list.toArray(arr);
    //
    //    for (Member m : arr) {
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }

    //    Object[] arr = list.toArray();
    //
    //    for (Object item : arr) {
    //      Member m = (Member)item;
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }


    // 1) 반복문으로 꺼낸다
    //    for (int i = 0; i < list.size(); i++) {
    //      Member m = list.get(i);
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }



    //    class MyConsumer implements Consumer<Member> {
    //      @Override
    //      public void accept(Member m) {
    //        // forEach() 에서 반복문을 돌릴 때
    //        // Consumer 규칙에 따라 
    //        // 각 항목에 대해 이 메서드를 호출한다.
    //        System.out.printf("이름: %s, 나이: %d\n", m.name, m.age);
    //      }
    //    }
    //
    //    list.forEach(new MyConsumer());
>>>>>>> 5e6872205c5736ee57fe101ee3c4689afd56c8a9
  }
}







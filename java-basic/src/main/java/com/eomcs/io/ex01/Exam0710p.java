// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710p {

  public static void main(String[] args) throws Exception {

    // 결과 예)
    // /Users/bitcamp/git/test
    // src/
    //   main/
    //     java/
    //       com/
    //         Hello.java
    //         Hello2.java
    // build.gradle
    // settings.gradle
    // Hello.java
    // ...

    File dir = new File(".");
    System.out.println(dir.getCanonicalPath());


    printList(dir, 1);
  }
  static void printList(File dir, int level) {

    File[] files = dir.listFiles();
    for (File f : files) {
      printIndent(level);

      if (f.isDirectory() &&  !f.isHidden()) {
        System.out.printf("%s/\n", f.getName());
        printList(f, level + 1);
      } else if (f.isFile()) {
        System.out.printf("%s/n", f.getName());
      }
    }
  }

  static void printIndent(int level) {
    for (int i  = 0; i < level; i++) {
      System.out.println("  ");
    }
  }

}



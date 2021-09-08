// 활용 - 지정한 폴더에서 .class 파일만 찾아 출력하라.
package com.eomcs.io.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam0740 {

  public static void main(String[] args) throws Exception {

    File dir = new File("bin/main");
    System.out.println(dir.getCanonicalPath());

    printClasses(dir);
  }

  static void printClasss(File dir) {

    File[] f = dir.listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        return pathName.isDirectory() || (pathname.isFile() && pathname.getName().endsWith(".class"));
      }
    });

    for (File file : f) {
      if (file.isDirectory()) {

      }
    }

  }

}
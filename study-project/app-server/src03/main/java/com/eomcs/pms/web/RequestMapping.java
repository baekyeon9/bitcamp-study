package com.eomcs.pms.web;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
  String value() default ""; // requestMapping을 필수로 만들지 말자! 값이 없다면 빈 문자열!
}

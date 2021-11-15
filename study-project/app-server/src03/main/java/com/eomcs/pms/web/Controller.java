package com.eomcs.pms.web;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
  String value() default ""; // 값을 안주면 기본 문자열
}

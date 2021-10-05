package com.eomcs.openapi.json;

import java.sql.Date;

public class Member {
  private int no;
  private String name;
  private String email;
  private String password;
  private String photo;
  private String tel;
  private Date registeredDate;

  @Override
  public String toString() {
    return "Member [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password
        + ", photo=" + photo + ", tel=" + tel + ", registeredDate=" + registeredDate + "]";
  }


  public void setNo(int no) {
    this.no = no;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
}
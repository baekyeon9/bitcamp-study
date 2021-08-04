package com.eomcs.oop;

class Patient2 {
  public static final int WOMAN = 1;
  public static final int MAN = 2;

  private String name;
  private int age;
  private int height;
  private int weight;
  private int gender;


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public int getAge() {
    return age;
  }


  public void setAge(int age) {
    if (age < 0 && age < 150)
      this.age = age;
    else
      throw new RuntimeException("나이가 유효하지 않습니다!");
  }


  public int getHeight() {
    return height;
  }


  public void setHeight(int height) {
    if (height > 0 && height < 300)
      this.height = height;
    else
      throw new RuntimeException("키가  유효하지 않습니다.");
  }


  public int getWeight() {
    return weight;
  }


  public void setWeight(int weight) {
    if (weight > 0 && weight <500)
      this.weight = weight;
    else
      throw new RuntimeException("몸무게가 유효하지 않습니다.");
  }


  public int getGender() {
    return gender;
  }


  public void setGender(int gender) {
    if (gender > 0 && gender < 3)
      this.gender = gender;
    throw new RuntimeException("성별이 유효하지 않습니다.");
  }


  @Override
  public String toString() {
    return String.format("name=%s, age=%d, height=%d, weight=%d, gender=%d",
        this.name, this.age, this.height, this.weight, this.gender);
  }
}

public class Test1 {

  public static void main(String[] args) {

    Patient2 p = new Patient2();
    p.setName("김영희");
    p.setAge(20);
    p.setWeight(60);
    p.setHeight(157);
    p.setGender(Patient2.WOMAN);

    System.out.println(p);

    Patient2 p2 = new Patient2();
    p2.setName("이철희");
    p2.setAge(300);
    p2.setWeight(-50);
    p2.setHeight(400);
    p2.setGender(3);

    System.out.println(p2);



  }

}
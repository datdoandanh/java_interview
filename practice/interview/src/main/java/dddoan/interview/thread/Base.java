/**
* Author: DatDoan
* Created Date: Jun 2, 2018
*/
package dddoan.interview.thread;

public class Base {
  protected String name;
  public Base() {
    System.out.println("Inside no argument constructor of Base class");
  }
  public Base(String name) {
    System.out.println("Inside one arg constructor from Base class");
  }
}

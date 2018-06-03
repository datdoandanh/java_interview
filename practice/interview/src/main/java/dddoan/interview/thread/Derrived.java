/**
* Author: DatDoan
* Created Date: Jun 2, 2018
*/
package dddoan.interview.thread;

public class Derrived extends Base{
  public Derrived() {
    System.err.println("Inside no argument constructor of Derived class");
  }
  public Derrived(String name) {
    super("");
    System.out.println("Inside one arg constructor from Derived class");
  }
}

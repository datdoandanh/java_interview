/**
 * Author: DatDoan Created Date: May 27, 2018
 */
package dddoan.interview.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class UsingExecutor {
  class ThreadPrinter implements Runnable {

    public void run() {
      System.out.println("UsingExecutor.ThreadPrinter.run()");
    }

  }

  public void test() {
    final Executor executor = Executors.newCachedThreadPool();
    executor.execute(new ThreadPrinter());
  }
  public static void main(String[] args) {
    new UsingExecutor().test();
  }
}

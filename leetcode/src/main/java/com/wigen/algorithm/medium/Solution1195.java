package com.wigen.algorithm.medium;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * <p>
 *
 * </p>
 *
 * @author wangwq
 */
public class Solution1195 {
    class FizzBuzz {
        private int n;

        public FizzBuzz(int n) {
            this.n = n;
        }

        Semaphore s1 = new Semaphore(0);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);
        Semaphore s4 = new Semaphore(1);

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            for (int i = 3; i <= n; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    s1.acquire();
                    printFizz.run();
                    s4.release();
                }
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            for (int i = 5; i <= n; i++) {
                if (i % 3 != 0 && i % 5 == 0) {
                    s2.acquire();
                    printBuzz.run();
                    s4.release();
                }
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            for (int i = 3; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    s3.acquire();
                    printFizzBuzz.run();
                    s4.release();
                }
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                if (i % 3 != 0 && i % 5 != 0) {
                    s4.acquire();
                    printNumber.accept(i);
                    s4.release();
                } else if (i % 3 == 0 && i % 5 != 0) {
                    s1.release();
                } else if (i % 3 != 0 && i % 5 == 0) {
                    s2.release();
                } else if (i % 3 == 0 && i % 5 == 0) {
                    s3.release();
                }
            }
        }
    }
}

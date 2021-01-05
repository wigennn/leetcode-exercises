package com.wigen.algorithm.medium;

import java.util.concurrent.Semaphore;

/**
 * <p>
 *
 * </p>
 *
 * @author wangwq
 */
public class Solution1117 {
    class H2O {
        Semaphore s1 = new Semaphore(2);
        Semaphore s2 = new Semaphore(0);
        public H2O() {

        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            s1.acquire(1);
            releaseHydrogen.run();
            s2.release(1);
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {

            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            s2.acquire(2);
            releaseOxygen.run();
            s1.release(2);
        }
    }
}

package com.singleton.test;

import com.singleton.runnable.NavigatorRunnable;

public class MultiThreadTest {
    public static void main(String[] args) {
        NavigatorRunnable runnable = new NavigatorRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

    }
}

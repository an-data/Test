package com;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Test {

    /**
     * 测试 线程的解锁
     *
     * synchronized 是监视器 信号量的实现
     *  unsafe.unpark 直接操作线程 让阻塞中的线程解锁
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        Unsafe unsafe;
        Object lock = new Object();
        Thread thread = new Thread(() -> {
            System.out.println("执行代码");
            System.out.println("===========");
            System.out.println("即将被锁住");
            try {
                synchronized (lock) {
                    lock.wait();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("解锁完成");
        });
        thread.start();

        Thread.currentThread().sleep(4);

        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        unsafe = (Unsafe) field.get(null);

        Thread.sleep(500);
        unsafe.unpark(thread);
    }

}

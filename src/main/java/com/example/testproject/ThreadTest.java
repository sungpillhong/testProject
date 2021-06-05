//package com.example.testproject;
//
//public class ThreadTest implements Runnable {
//
//    String name;
//
//    ThreadTest(String name){
//        this.name=name;
//    }
//
//    @Override
//    public void run() {
//        try {
//            for(int i =0; i < 5; i++){
//                System.out.println(name);
//                Thread.sleep(1000L);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("쓰레드 종료 : " + name);
//    }
//
//    public static void main(String[] args) {
//        Runnable r1 = new ThreadTest("손흥민1");
//        Runnable r2 = new ThreadTest("손흥민2");
//        Runnable r3 = new ThreadTest("손흥민3");
//        Runnable r4 = new ThreadTest("손흥민4");
//        Runnable r5 = new ThreadTest("손흥민5");
//
//        Thread thread1 = new Thread(r1);
//        Thread thread2 = new Thread(r2);
//        Thread thread3 = new Thread(r3);
//        Thread thread4 = new Thread(r4);
//        Thread thread5 = new Thread(r5);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//
//    }
//
//}
//
//

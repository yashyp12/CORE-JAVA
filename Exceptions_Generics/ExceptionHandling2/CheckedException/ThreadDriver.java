//package Exceptions_Generics.ExceptionHandling2.CheckedException;
//
//
//class Example1{
////        for (int i =1;i<=10;i++){
////            System.out.println(name + ":" + i);
////        }
////    }   public void printNumber(String name){
//
//
////    now it will print in synchronzed way bit slower
//    public synchronized void printNumber(String name){
//        for (int i =1;i<=10;i++){
//            System.out.println(name + ":" + i);
//        }
//    }
//}
//
//
//class MyThread extends Thread{
//
//    ExceptionExample21 obj ; // null
//    MyThread(ExceptionExample21 obj){
//        this.obj = obj;
//    }
//
//    public void run(){
//        obj.printNumber("Yash");
//    }
//}
//
//public class ThreadDriver {
//
//    static void main(String[] args) {
//
//        //both are sharing same object and callign same method
//        ExceptionExample21 obj = new ExceptionExample21();
//        MyThread t1 = new MyThread(obj);
//
//        t1.start();
//        obj.printNumber("Main");
//    }
//}

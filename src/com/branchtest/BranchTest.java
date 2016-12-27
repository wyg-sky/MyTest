package com.branchtest;

public class BranchTest {

    public static void main(String[] args) {
        sayHello();
    }
    
    public static void sayHello(){
        System.out.println("Hello : I am master");
    }
    
    public static void sayHello2(){
        System.out.println("Hello : I am develop");
    }
    
    public  void sayHello(String str){
        System.out.println("master");
    }
    
    public  void sayHello2(String str){
        System.out.println("develop");
    }

}

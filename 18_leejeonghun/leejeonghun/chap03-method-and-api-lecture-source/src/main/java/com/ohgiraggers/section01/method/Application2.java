package com.ohgiraggers.section01.method;

public class Application2 {
    public static void main(String[] args) {

        System.out.println("main() 시작함...");

        Application2 app2 = new Application2();  //객체생성
        app2.methodA();     // methodA push 이후 methodA가 일을 끝나면 할 내용이 없으면 pop
        app2.methodB();     // methodB push 이후 methodB가 일을 끝나면 할 내용이 없으면 pop
        app2.methodC();     // methodC push 이후 methodC가 일을 끝나면 할 내용이 없으면 pop

        System.out.println("main() 종료됨...");
    }

    public void methodA(){
        System.out.println("methodA() 호출함...");
        System.out.println("methodA() 종료됨...");
    }
    public void methodB(){
        System.out.println("methodB() 호출함...");
        System.out.println("methodB() 종료됨...");
    }
    public void methodC(){
        System.out.println("methodC() 호출함...");
        System.out.println("methodC() 종료됨...");
    }
}

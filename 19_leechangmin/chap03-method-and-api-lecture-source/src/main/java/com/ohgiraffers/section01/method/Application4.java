package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

Application4 app4 = new Application4();
app4.testMethod("이리온", 10, '남');
app4.testMethod("이리오프", 20, '여');

String name = "유관순";
int age = 20;
char gender = '여';
app4.testMethod(name, age, gender);




    }

    /***
     * 
     * @param name 이름
     * @param age 나이
     * @param gender 성별
     */
    public void testMethod(String name, int age, final char gender){
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
//        gender = 'a'; 내부에서는 final이라 변수 값 수정 x
    }


}

package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    public static String rockPaperScissors(){

        int a = (int) (Math.random() * 3);
        switch (a){
            case 0 :
                System.out.println("가위");
                return "가위";
            case 1 :
                System.out.println("바위");
                return "바위";
            case 2 :
                System.out.println("보");
                return "보";
            default :
                return "오류";
        }
    }

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

    public static String tossCoin(){
        int a = (int) (Math.random()*10)+1;
        String result;

        if ((a % 2) == 0){
            System.out.println("앞면");
            result = "앞면";
        }
        else {
            System.out.println("뒷면");
            result = "뒷면";
        }
        return result;
    }
}

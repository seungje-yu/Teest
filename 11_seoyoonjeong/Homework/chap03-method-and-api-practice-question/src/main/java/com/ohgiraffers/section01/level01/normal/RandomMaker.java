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

    public String rockPaperScissors(){

            int random=(int)(Math.random()*3);
            if( random==1){
                System.out.println("가위");
            }else if(random==2){
                System.out.println("바위");
            }else if(random==0){
                System.out.println("보");
            }
        return null;
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
    public String  tossCoin(){

        int random=(int)(Math.random()*2);
        if(random==1){
            System.out.println("앞면");
        }else if(random==0){
            System.out.println("뒷면");
        }
        return null;
    }


}

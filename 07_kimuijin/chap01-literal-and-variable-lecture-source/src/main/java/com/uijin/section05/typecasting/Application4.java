package com.uijin.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {

        /*
         * 형변환 사용 시 주의할 점
         * 데이터 손실에 유의해서 사용해야 한다.
         */

        // 의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum);

        // 의도치 않은 데이터 손실이 일어나지 않도록 값을 확인해봐야 한다.

        double height = 185.5;
        int floorHeight = (int) height;     // 소수점만 버려짐
        System.out.println("height = " + height);
        System.out.println("floorHeight = " + floorHeight);     // 소수점 절삭에 사용
    }
}

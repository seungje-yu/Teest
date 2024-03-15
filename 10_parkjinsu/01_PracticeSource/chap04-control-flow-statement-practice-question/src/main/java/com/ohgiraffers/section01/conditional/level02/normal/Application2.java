package com.ohgiraffers.section01.conditional.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */


        double manCm = 170.0;
        double height = manCm * 0.01;

        double weight = 67;

        double bmi = weight / ((height * height) );
//        System.out.println(bmi);

        String bodyMass = "";

        if (bmi >= 30) {
            bodyMass = "비만";
        } else if (25 <= bmi && bmi < 30) {
            bodyMass = "과체중";
        } else if (20 <= bmi && bmi < 25) {
            bodyMass = "정상체중";
        } else {
            bodyMass = "저체중";
        }

        System.out.println("당신은 " + bodyMass + " 입니다.");
    }
}

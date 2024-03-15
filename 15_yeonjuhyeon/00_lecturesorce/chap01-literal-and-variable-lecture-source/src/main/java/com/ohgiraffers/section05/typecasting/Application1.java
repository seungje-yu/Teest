package com.ohgiraffers.section05.typecasting;

public class Application1 {
        public static void main(String [] args){

            byte bnum = 1;
            short snum = bnum;
            int inum = snum;
            long lnum = inum;

            int num1 = 10;
            long num2 = 20;

//            int result = num1 + num2;
            //자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
             long result1 = num1 + num2;

             float fnum = 4.0f;
             double dnum = fnum;
             double result2 = fnum + dnum;


//             long eight = 8888888888888888888;
                // long값 끝에 L을 붙이지 않으면 int값으로 인식하여 오류가 남 (자동형변환)

                long eight = 8;
                float four = eight;
                System.out.println("four = " + four);

                float result3 = eight + four;
                System.out.println("result3 = " + result3);

                char ch1 = 'a';
                int charNumber = ch1;

                System.out.println("charNumber = " + charNumber);       // charNumber = 97

                char ch2 = 65;
                System.out.println("ch2 = " + ch2);             // ch2 = A (char 자동형변환)

                boolean isTrue = true;
//                byte b = isTrue;
//                short s = isTrue;
//                int i = isTrue;
//                long l = isTrue;
//                char c = isTrue;
//                float f = isTrue;
//                double d = isTrue;
//                // 어느 자료형이든 boolean을 형변환해서 담을 수 없다.
        }

}

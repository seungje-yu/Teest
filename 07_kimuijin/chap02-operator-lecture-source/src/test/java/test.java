public class test {
    public static void main(String[] args) {

        int num = 10;
        int result1 = num++ * 3;
        int result3 = result1++ +1;
        System.out.println("num = " + num);//11
        System.out.println("result1 = " + result1);//31
        System.out.println("result3 = " + result3);//31

        int num2 = 10;
        int result2 = num2++;
//        System.out.println("num2 = " + num2);
//        System.out.println("result2 = " + result2);

    }
}

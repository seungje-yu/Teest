public class test2 {
    public static void main(String[] args) {
        int num = 10;
        int result1 = num++ * 3;
        int result3 = result1++;
        System.out.println("num = " + num);//11
        System.out.println("result1 = " + result1);//31
        System.out.println("result3 = " + result3);//30

        System.out.println("(result3*2) = " + (result1*2));//62
    }
}

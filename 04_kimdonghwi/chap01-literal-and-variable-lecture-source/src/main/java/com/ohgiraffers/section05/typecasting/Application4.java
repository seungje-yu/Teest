package com.ohgiraffers.section05.typecasting;

public class Application4 {
    /**
     * [Precautions when using type conversion]
     * Be careful of data loss when using type conversion.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Unintended data loss
        int inum = 290;
        byte bnum = (byte) inum;    // forced type conversion to byte

        System.out.println("inum = " + inum); // 290
        System.out.println("bnum = " + bnum); // 34

        // Intended data loss
        double height = 185.5;
        int floorHeight = (int) height; // forced type conversion to int
        System.out.println("height = " + height);               // 185.5
        System.out.println("floorHeight = " + floorHeight);     // 185
    }
}

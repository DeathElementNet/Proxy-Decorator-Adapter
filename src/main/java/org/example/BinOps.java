package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int arg1 = Integer.parseInt(a);
        int arg2 = Integer.parseInt(b);
        int result = arg1 + arg2;
        return Integer.toBinaryString(result);
    }


    public String mult(String a, String b) {
        int arg1 = Integer.parseInt(a);
        int arg2 = Integer.parseInt(b);
        int result = arg1 * arg2;
        return Integer.toBinaryString(result);
    }
}
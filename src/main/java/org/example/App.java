package org.example;


public class App {
    public static void main(String[] args) {
        System.out.println(isSimple(121));
    }
    public static int isSimple(int n) {
        int result = 0;
        for (int i=2; i<=(n/2); i++) {
            result =  (n % i != 0) ? 0 : i;
            if (result == i) break;
        }
        return result;
    }
    public static byte daysCount(byte month, int year) {
        byte result = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                result = (byte) (year % 4 == 0 & (year % 100 != 0 | year % 400 == 0) ? 29 : 28);
        }
        return result;
    }

}
    /* public static long fibonazzi (byte N){
        return N <= 1 ? N : fibonazzi((byte) (N-1)) + fibonazzi((byte)(N-2));
    */

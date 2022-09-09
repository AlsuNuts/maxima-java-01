package org.example;


//Написать функцию byte daysCount(byte month, int year), которая по номеру месяца и номеру года возвращает число дней в месяце.
// Год високосный, если year % 4 == 0 & (year % 100 != 0 | year % 400 == 0
// 31 день - 1, 3, 5, 7, 8, 10, 12
// 30 дней - 4, 6, 9, 11
public class App
{
    public static void main( String[] args )
    {
        System.out.println(daysCount((byte) 2, 2004 ));
    }
    public static String daysCount(byte month, int year)
    {

        String result = "";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result  = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30";
                break;
                // если не получится сделать иф внутри снича, то попробовать февраль сделать отдельно
            case 2:
                if (year % 4 == 0 & (year % 100 != 0 | year % 400 == 0)) {
                    return result = "29";
                }
                result = "28";

            }

        return result;
    }
}
    /* public static long fibonazzi (byte N)
    {
        return N <= 1 ? N : fibonazzi((byte) (N-1)) + fibonazzi((byte)(N-2));
    }

    if (month == 2) {
            if (year % 4 == 0 & (year % 100 != 0 | year % 400 == 0)) {
                result = "29";
            }
        }
            result = "28"; */
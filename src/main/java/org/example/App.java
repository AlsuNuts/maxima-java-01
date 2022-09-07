package org.example;


//Написать рекурсивную функцию long fibonazzi (byte N), возвращающую N-й член последовательности Фибоначчи
// 0 1 1 2 3 5 8 13
// 0 1 2 3 4 5 6 7
//  формула: F(n) = F(n-1) + F(n-2)

public class App
{
    public static void main( String[] args )
    {
        System.out.println(fibonazzi((byte) 7));
    }
    public static long fibonazzi (byte N)
    {
        return N <= 1 ? N : fibonazzi((byte) (N-1)) + fibonazzi((byte)(N-2));
    }
}
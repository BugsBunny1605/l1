package com.company;
//Объявить переменные всех вам известных типов и вывести их значения на экран.
public class C1 {
    public static void main (String[] args)
    {
        byte byte1 = 1; //в задании не было сказано, что переменные надо инициализировать, но у меня не получиось обработать ошибку
        short short1 = 1;
        int int1 = 1;
        long long1 = 1;
        float float1 = 1;
        double double1 = 1;
        char char1 = 1;
        boolean boolean1 = true;
        String string1 = new String("1");
        C1 c1 = new C1();

        System.out.println("byte: "+byte1);
        System.out.println("short: "+short1);
        System.out.println("int: "+int1);
        System.out.println("long: "+long1);
        System.out.println("float: "+float1);
        System.out.println("double: "+double1);
        System.out.println("char: "+char1);
        System.out.println("boolean: "+boolean1);
        System.out.println("string: "+string1);
        System.out.println("C1: "+c1);
    }
}

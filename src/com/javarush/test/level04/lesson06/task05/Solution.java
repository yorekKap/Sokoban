package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));//напишите тут ваш код

        String name=reader.readLine();
        String age=reader.readLine();

        int  iage=Integer.parseInt(age);

        if (iage<18) System.out.println("Подрасти еще");
    }
}

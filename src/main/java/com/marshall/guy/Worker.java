package com.marshall.guy;

import java.math.BigInteger;

public class Worker implements Runnable
{
    public String name = "";

    public Worker(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        System.out.printf("Hi, I am thread \"%s\".%n", name);

        for (int i = 0; i < 500_000_000; i++)
        {
            BigInteger bigInt = new BigInteger(Integer.toString(i));
            if (i % 10_000_000 == 0)
            {
                System.out.println(bigInt.toString());
            }
        }

        System.out.printf("\"%s\" has finished.%n", name);
    }
}

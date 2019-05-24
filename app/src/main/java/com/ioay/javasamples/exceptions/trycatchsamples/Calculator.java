package com.ioay.javasamples.exceptions.trycatchsamples;

public class Calculator {

    public int divide(int num1, int num2) throws Exception {

        if (num2 == 0)
            throw new Exception("Not divided by 0.");
        return num1 / num2;
    }
}

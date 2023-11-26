package org.example;

public class SumCalculator{
    SumCalculator() {
    }

    static int sum(int userValue) throws Exception{

        if (userValue == 0 ){
            throw new IllegalArgumentException(userValue + " - incorrect number");
        }
        int result = 0;
        for (int i = 1; i < userValue+1; i++) {
            result += i;
        }

        return result;
    }

}

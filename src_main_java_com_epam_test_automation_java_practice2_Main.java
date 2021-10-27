package com.epam.test.automation.java.practice2;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value) {
         static int countBinaries(int value)
    {
        int ctr = 1;
        int ans = 0;
        while (value > 0)
        {

            if (value % 10 == 1)
            {
                ans += Math.pow(2, ctr - 1);
            }

            else if (value % 10 > 1)
            {
                ans = (int) (Math.pow(2, ctr) - 1);
            }
            ctr++;
            value /= 10;
        }
        return ans;
    }

}
        throw new UnsupportedOperationException();
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {

            if (value <= 0)
                return 0;

            int fibo[]=new int[value+1];
            fibo[0] = 0; fibo[1] = 1;

            int sum = fibo[0] + fibo[1];

            for (int i=2; i<=value; i++)
            {
                fibo[i] = fibo[i-1]+fibo[i-2];
                sum += fibo[i];
            }

            return sum;
   

    


        throw new UnsupportedOperationException();
    }
}

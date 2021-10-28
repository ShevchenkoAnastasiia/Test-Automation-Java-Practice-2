package com.epam.test.automation.java.practice2;

public class Main {
    
    static int task2(int value)
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
        public static void main (String[] args)
    {
        int value = 20;
        System.out.print(task2 (value));
    }


    static int task3 (int value)
        {
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
        }

        public static void main(String args[])
        {
            int value = 4;
            System.out.println("Sum of Fibonacci" +
                    " numbers is : "+ task3(value) );
        }
}




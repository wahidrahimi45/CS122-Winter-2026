package org.example.randomizer;

import java.util.Random;

public class Randomizer {
    public static int even;
    public static int odd;
    private Random random;

    public Randomizer()
    {
        this.random = new Random();
    }
    public void generate(int low, int high)
    {
        if(high < low)
        {
            System.out.println("The high cannot be less than low");
            return;
        }
        int randomNumber = random.nextInt(low, high+1);
        if(randomNumber % 2== 0)
        {
            even++;
        }
        else {
            odd++;
        }
    }
    public void generate()
    {
//        int randomNumber = random.nextInt(1, 100+1);
//        if(randomNumber % 2== 0)
//        {
//            even++;
//        }
//        else {
//            odd++;
//        }
        generate(1,100);
    }
}

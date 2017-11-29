package com.company;

import static com.company.MonteCarlo.radius;

/**
 * Created by Veronica Lang on 11/28/2017.
 */
public class Tester {
    public static void main(String[] args) {
        MonteCarlo mcObj = new MonteCarlo();
        mcObj.MonteCarlo(5,3,2);
        double a;
        double b;
        int cirCount = 0;
        int sqrCount = 0;
        for (int i = 0; i <=100; i++){
            a = mcObj.nextRainDrop_x();
            b = mcObj.nextRainDrop_y();
            if (mcObj.insideCircle(a,b) == true){
                cirCount++;
            }
            sqrCount++;
            double shouldBeNearPi = (cirCount * Math.pow(a, 2))
                    /(sqrCount * Math.pow(radius, 2));
            //not sure what side was so i just put a
            System.out.println(shouldBeNearPi);
        }

    }
}

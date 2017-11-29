package com.company;

import java.util.Random;

/**
 * Created by Veronica Lang on 11/28/2017.
 */
public class MonteCarlo {
    public static double length;
    public static double height;
    public static double radius;
    private Random rndm;

    public void MonteCarlo(double h, double k, double r) {
        length = h;
        height = k;
        radius = r;
    }

    public double nextRainDrop_x() {
        double x = rndm.nextDouble(); //correspond to a random raindrop's
        //x position
        return x;
    }

    public double nextRainDrop_y() {
        double y = rndm.nextDouble();
        return y;
    }

    public boolean insideCircle(double x, double y) {
        //test if parameters of x and y inside circle or not
        if ((Math.pow((x-length), 2) + Math.pow((y-height), 2))
                <= Math.pow(radius, 2)){ //MATH
            //h,k is the center, and r is the radius
            return true; //if inside
        } else {
            return false;
        }
    }
}

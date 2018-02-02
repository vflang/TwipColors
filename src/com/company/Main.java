package com.company;
import java.util.*;
/*
create a color converter.
The only rule is that this must be done mathematically and not javaically.
The idea with this assignment is the user can enter either an RGB triplet (255, 65, 4),
hexadecimal (f23ab2), or named color from the common 140 HTML colors located IN THE LINK BELOW.
Once an input is received, the other 2 colors are outputted to the user. Think of it as a color converter.

Hex to RGB conversion:
1. Get the 2 left digits of the hex color code and convert to decimal value to get the red color level.
2. Get the 2 middle digits of the hex color code and convert to decimal value to get the green color level.
3. Get the 2 right digits of the hex color code and convert to decimal value to get the blue color level.

other 2 colors?? you mean like the other forms of it like triplet, hex, or name?

i don't really know where to start with this mathematically wise.
like split for RGB inputs and character arrays for hexadecimal?
turn userInput into an array of characters
maybe make one big array with all the combos/three arrays with the stuff in order???
and find the keyword --> call upon the same index of all of them
but that isn't really mathematical..
hex F = 255 in RGB


 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Color name list: AliceBlue, AntiqueWhite, Aqua Aquamarine, Azure, " +
                "Beige, Bisque, Black, BlanchedAlmond, Blue, BlueViolet, Brown, BurlyWood, " +
                "CadetBlue, Chartreuse, Chocolate, Coral, CornflowerBlue, Cornsilk, Crimson, " +
                "Cyan, DarkBlue, DarkCyan, DarkGoldenRod, DarkGray, DarkGrey, DarkGreen, DarkMagenta, " +
                "DarkOliveGreen, DarkOrange, DarkOrchid, DarkRed, DarkSalmon, DarkSeaGreen, DarkSlateBlue, " +
                "DarkSlateGray, DarkSlateGrey, DarkTurquoise, DarkViolet, DeepPink, DeepSkyBlue, DimGray" +
                ", DimGrey, DodgerBlue, FireBrick, FloralWhite, ForestGreen, Fuchsia, Gainsboro, GhostWhite" +
                ", Gold, GoldenRod, Gray, Grey, Green, GreenYellow, HoneyDew, HotPink, IndianRed, Indigo " +
                ", Ivory, Khaki, Lavender, LavenderBlush, LawnGreen, LemonChiffon, LightBlue, LightCoral, LightCyan" +
                ", LightGoldenRodYellow, LightGray, LightGrey, LightGreen, LightPink, LightSalmon, LightSeaGreen" +
                ", LightSkyBlue, LightSlateGray, LightSlateGrey, LightSteelBlue, LightYellow, Lime, LimeGreen" +
                ", Linen, Magenta, Maroon, MediumAquaMarine, MediumBlue, MediumOrchid, MediumPurple, MediumSeaGreen" +
                ", MediumSlateBlue, MediumSpringGreen, MediumTurquoise, MediumVioletRed, MidnightBlue, MintCream" +
                ", MistyRose, Moccasin, NavajoWhite, Navy, OldLace, Olive, OliveDrab, Orange, OrangeRed, Orchid" +
                ", PaleGoldenRod, PaleGreen, PaleTurquoise, PaleVioletRed, PapayaWhip, PeachPuff, Peru, Pink" +
                ", Plum, PowderBlue, Purple, RebeccaPurple, Red, RosyBrown, RoyalBlue, SaddleBrown, Salmon, SandyBrown" +
                ", SeaGreen, SeaShell, Sienna, Silver, SkyBlue, SlateBlue, SlateGray, SlateGrey, Snow, SpringGreen" +
                ", SteelBlue, Tan, Teal, Thistle, Tomato, Turquoise, Violet, Wheat, White, WhiteSmoke, Yellow" +
                ", YellowGreen"); //i commit seppuku
        System.out.println("Please input a color name (from the list printed above), Hex code, or RGB triplet. " +
                "\n *also, please leave off the # on the Hex code--this won't work if you don't.");
        Scanner userInput = new Scanner(System.in);
        String str = userInput.toString().toLowerCase();
        if (str.contains(",")) { //RGB triplet
            String[] RGBarray = str.split(",");


        } else if (str.length() == 6) { //Hexadecimal
            System.out.println("Your RGB triplet code is: ");
            String hex1 = str.substring(0,2);
            String hex2 = str.substring(2,4);
            String hex3 = str.substring(4,6);
            /*String HexArray[] = new String[3];
            HexArray[1] = hex1;
            HexArray[2]= hex2;
            HexArray[3]= hex3;
            */

            //HexArray[i];  multiply values by 16^x, x depends on which place (0 is for the ones place)
            //then add to get the decimal equivalent
            //oh well poop that means i needed an actual normal character array aghh well just arrays of
            //2 for each lil substring ones

            char[] HexArray1 = hex1.toCharArray();
            char[] HexArray2 = hex2.toCharArray();
            char[] HexArray3 = hex3.toCharArray();
            int x = 0;
            int num1;
            int num2;
            int sum;
            for (int i = 0; i <= HexArray1.length; i++) {
                    num2 = HexArray1[i] * (int) Math.pow(16, x);
                    num1 = num2;
                    //int intResult = (int) Math.pow(2, 3);
                    sum = num1 + num2;
                    System.out.println(sum);
                }
            System.out.print(",");
            for (int i = 0; i <= HexArray2.length; i++) {
                num2 = HexArray2[i] * (int) Math.pow(16, x);
                num1 = num2;
                //int intResult = (int) Math.pow(2, 3);
                sum = num1 + num2;
                System.out.print(sum);
            }
            System.out.print(",");
            for (int i = 0; i <= HexArray3.length; i++) {
                num2 = HexArray3[i] * (int) Math.pow(16, x);
                num1 = num2;
                //int intResult = (int) Math.pow(2, 3);
                sum = num1 + num2;
                System.out.print(sum);
            }
            //put the sums into another array which is the rgb?? i mean i dunno not really necessary i guess i dont know

        } else { //if the name is given
            //i honestly dunno how im going to do this mathematically so im just gonna sop this
            String Hex = "";
            String RGB = "";
            if (str == "aliceblue"){
                Hex = "#F0F8FF";
                RGB = "240, 248, 255";
                System.out.println(str + "'s Hex code: " + Hex + "\n"+ str + "'s RGB code: " + RGB);
            }else if (str=="antiquewhite"){
                Hex = "#FAEBD7";
                RGB = "250, 235, 215";
                System.out.println(str + "'s Hex code: " + Hex + "\n"+ str + "'s RGB code: " + RGB);
            } //etc

        }
    }
}

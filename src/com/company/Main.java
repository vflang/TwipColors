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
        Scanner userInput = new Scanner(System.in);
        String str = userInput.toString().toLowerCase();
        if (str.contains(",")) { //RGB triplet
            String[] RGBarray = str.split(",");

        } else if (str.contains("#")) { //Hexadecimal
            char[] HexArray = str.toCharArray();
            for (int i = 0; i <= HexArray.length; i++) {
                if (HexArray.length == 3) {
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
                    }

                }
            }
        }
    }
}

/**
 * class name: Variables.java
 * author: __Walker Bell______
 * date:
 * version:
 * description: This program will display summary of primitive data types.
 * source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * direction: 1) read the source material
 *            2) summary of primitive data types: byte, short, int, long, float,
 *            double, boolean, char (2 lines per each type)
 *
 */
public class Variables {
    public static void main(String[] args) {
        System.out.println("Summary of The Primitive Data Types");


        System.out.println("Byte- Has a minimum value of -128 and max of 127.");
        System.out.println("This data type is useful for saving large amounts of memory.");
        System.out.println("Short-This data type is 16-bit. Minimum value of -32,768 and max 32,767.");
        System.out.println("Can be used tp save large amounts of data when you need to.");
        System.out.println("Int- This type is 32-bit with a max value of -2^31 and a max of 2^31-1.");
        System.out.println("Use this type as an unsigned integer. ");
        System.out.println("Long- This is a 64-bit data type with a min value of -2^63 and max of 2^63-1.");
        System.out.println("In Java SE 8 or later use this to represent an unsigned 64-bit long and when you need a range or values wider than int.");
        System.out.println("Float is a single precision 32-bit. Use it to save large amount of floating point numbers.");
        System.out.println("Double is a double precision 64-bit floating point. Usually a defualt choice.");
        System.out.println("Boolean has only two values, true and false. Use this for conditions with true or false.");
        System.out.println("Char is a single 16-bit unicode character and a min valuse of u000 and max of ufff.");
    }
}

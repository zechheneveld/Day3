package com.company;

public class MathNotes {

    public static void main(String[] args) {
        System.out.println("Hello");


        int scottsNumber = 100;
        scottsNumber = scottsNumber + 100;
        System.out.println(scottsNumber);
        //This will equal 200 because you're updating the value

        scottsNumber += 100; //this is the same as the above
        System.out.println(scottsNumber);
        // This method can be used for all basic math problems

        int interation = 1;
        interation++; //takes the interation and adds 1 to it (subtraction would be --)
        System.out.println(interation);

        int mod = 10;
        mod = mod % 3; //takes the current number and divides it by whatever is entered and provides whatever is leftover
        System.out.println("mod: " + mod);


    }
}

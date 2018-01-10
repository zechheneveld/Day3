package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Welcome. Please enter a number:");

        Scanner robot = new Scanner(System.in);
        String inputFromUser = robot.nextLine();
        System.out.println("Here is what you entered: " + inputFromUser);
//        int scottsNumber = 12345;
//        String scottsStringNumber = "12345";
        // String will add whatever you enter to the end (ex. 123 + 4 = 1234)
        // int will sum up whatever you enter (ex. 123 + 4 = 127)

        //NOTES: Strings, and Scanners are classes whereas whatever is entered after is an object (int is a premitive, NOT CLASS)
        //Static class
        int convertedNumber = Integer.parseInt(inputFromUser);
        //to convert String to int, use "Interger.parseInt (...);"
        //see below for example
        System.out.println(convertedNumber);
        convertedNumber = convertedNumber + 5;
        System.out.println(convertedNumber);
// ConvertedNumber is whatever is entered by the user





    }
}

package com.timb;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the field length: ");  //shortcut is sout
        int inputValue = keyboard.nextInt();

        CreateOutputString(inputValue);
    }

    private static void CreateOutputString(int inputValue) {

        //System.out.println("inputValue = " + inputValue); //used for troubleshooting.
        int inputLen = Integer.toString(inputValue).length();
        //System.out.println("inputLen = " + inputLen); //used for troubleshooting.
        int i = 1;
        String outValue = null;

        if(inputValue == 1) { //If input value is 1 then just output 1
            outValue = "";
        } else { //Anything incoming other than 1 goes through this
            while (i <= inputValue - inputLen) {
                if (i == 1) {
                    outValue = Integer.toString(i);
                    i++;
                } else {
                    outValue = (i % 10) + outValue; //Returns the last value position value of a number (ex 124 % 10 would return 4) and concatenates that to the beginning of the existing OutValue.
                    i++;
                }
                ;
            }
        }
        System.out.println("outValue = " + inputValue + outValue);

    }
}

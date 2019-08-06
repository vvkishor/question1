package com.javatest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

/* This program is to test a software application which generates random numbers with the following conditions:
     . Generates 50 lines of numbers
     . Column one - Serial number of the random number
     . Column two - random number X >=100 & <=500
     -----------------------------------------------------

     Test case 1: random_numbersc.txt file has 50 lines
     Test case 2: random_numbersb.txt file has 50 lines
     */
public class numberValidationTests {

    public static void main(String[]args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("random_numbersc.txt"));
        int count = 1;
        while (file.hasNextLine()) {
            file.nextLine();
            count++;
        }
        while (file.hasNextInt()){
        }
        if (count++ == 50) {
            System.out.println("Test one (random_numbersc file contains 50 lines) : Passed");
        }
        else {
            System.out.println("Test one (random_numbersc file contains 50 lines) : Failed");
            System.out.println("Test one Failed due to missing line number");
        }

        Scanner file2 = new Scanner(new File("random_numbersb.txt"));
        int count2 = 1;
        while (file.hasNextLine()) {
            file.nextLine();
            count++;

        }
        if (count++ == 50) {
            System.out.println("Test two (random_numbersb file contains 50 lines) : PASSED");
        } else {
            System.out.println("Test two (random_numbersb file contains 50 lines) : FAILED");
            System.out.println("Test two Failed due to missing line number");
        }
    }
}


package com.javatest;

import java.io.File;
import java.util.Scanner;

public class numberValidationTest2 {
        static int k=1;
        public static void main(String [] args){

            int [] data =readFiles("random_numbersa.txt");
            for(int i=1; i<data.length; i+=2 )
                if(data[i]>100&&data[i]<500) {
                    System.out.println("Test case"+k+ ": PASSED");
                    k++;
                }else {
                    System.out.println("Test case"+k+ ": FAILED");
                    System.out.println("Line number "+k+" random number is out of range");
                    k++;
                }
        }
        public static int[] readFiles(String file){
            try{
                File f = new File(file);
                Scanner s = new Scanner(f);
                int lnr=0;
                while (s.hasNextInt()){
                    lnr++;
                    s.nextInt();
                }
                int [] arr =new int[lnr];
                Scanner s1 = new Scanner(f);
                for(int i=0; i<arr.length; i++)
                    arr[i] = s1.nextInt();
                return  arr;

            } catch (Exception e) {
                return null;

            }

        }


}
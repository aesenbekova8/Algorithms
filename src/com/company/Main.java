package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SimpleAlgorithms simpleAlgorithms = new SimpleAlgorithms();

        int[] randomArray = randomNumberGenerator(100);
        System.out.println("Random array: " + Arrays.toString(randomArray));

        System.out.println("Min value: " + simpleAlgorithms.minValueSearch(randomArray));
        System.out.println("Min index: " + simpleAlgorithms.minIndexSearch(randomArray));
        System.out.println("Bubble sort: " + simpleAlgorithms.bubbleSort(randomArray));

        System.out.println("My photos: ");
        ArrayList<File> fileList = new ArrayList<>();
        simpleAlgorithms.searchFiles(new File("/Users/ajdanaesenbekova/Downloads"), fileList);
        }

    //Creating array with random numbers
        private static int[] randomNumberGenerator(int bound) {
            Random rd = new Random();
            int[] randomArray = new int[5];

            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = rd.nextInt(bound);
            }

            return randomArray;
        }
}


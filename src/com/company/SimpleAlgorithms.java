package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class SimpleAlgorithms {
    // Finds the min value in an array
    public int minValueSearch(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    // Finds the index with min value in an array
    public int minIndexSearch(int[] array) {
        int minIndex = 0;
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    //Bubble sort
    public int[] bubbleSort(int[] array) {
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if(array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;

                    isSorted = false;
                }
                System.out.println(Arrays.toString(array));
            }
        }
        return array;
    }
    public void searchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();

            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}

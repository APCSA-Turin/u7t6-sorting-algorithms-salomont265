package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.example.project.Insertion_Sort.InsertionSort;

import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int iterations =0;

       for(int i=0;i<elements.length;i++){
        int smallIndex = i;
        int smallest = Integer.MAX_VALUE;
        for(int j= i;j<elements.length;j++){
            iterations++;
            if(elements[j] < smallest){
                smallIndex = j;
                smallest = elements[j];
            }
        }
        //swap
        int temp = elements[i];
        elements[i] = smallest;
        elements[smallIndex] = temp;

       }
       System.out.println("SELECTION SORT: Number of Loop Iterations: " + iterations);
       System.out.println("[");
       for(int i=0;i<elements.length-1;i++){
           System.out.print(elements[i] + ", ");
       }
       System.out.print(elements[elements.length-1] + "]");
       System.out.println();
        return elements;
    }
    public static int[] insertionSort(int[] elements) {
        int iterations = 0;
        for(int i=1;i<elements.length;i++){
         int current = elements[i];
         int j =i;
         while(j> 0 && current<elements[j-1]){
            iterations++;
             int temp = elements[j-1];
             elements[j] = temp;
             elements[j-1] = current;
             j--;
            
         }
        }
        System.out.println("INSERTION SORT: Number of Loop Iterations: " + iterations);
        System.out.println("[");
        for(int i=0;i<elements.length-1;i++){
            System.out.print(elements[i] + ", ");
        }
        System.out.print(elements[elements.length-1] + "]");
        System.out.println();
         return elements;
     }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
       for(int i=0;i<words.size();i++){
        int smallIndex = i;
        String smallest = "z";
        for(int j= i;j<words.size();j++){
            if(words.get(j).compareTo(smallest) < 0){
                smallIndex = j;
                smallest = words.get(j);
            }
        }
        //swap
        String temp = words.get(i);
        words.set(i, smallest);
        words.set(smallIndex,temp);
       }
      
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
   
}

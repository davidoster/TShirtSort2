/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import models.RandomTShirt;
import sorting.BubbleSort;
import sorting.BucketSort;
import sorting.QuickSort;
import sorting.QuickSortRandomTShirt;

/**
 *
 * @author George.Pasparakis
 */
public class TShirtSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        TShirt myTShirt = new TShirt();
//        System.out.println(myTShirt);
//        
        int[] myArray = {1, 22, 2, 9, 97};
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        BucketSort bus = new BucketSort();
        QuickSortRandomTShirt qsRand = new QuickSortRandomTShirt();
        
//        int[] qsArray = myArray.clone(); //Arrays.copyOf(myArray, myArray.length);
//        doIntQuickSort(qs, qsArray, 0, qsArray.length - 1);
//        
//        int[] bsArray = myArray.clone(); Arrays.copyOf(myArray, myArray.length);
//        doIntBubbleSort(bs, bsArray);
//        
//        int[] busArray = myArray.clone();
//        doIntBucketSort(bus, busArray);
        
        //RandomTShirt rTShirt1 = new RandomTShirt();
        List<RandomTShirt> randomTShirts = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            randomTShirts.add(new RandomTShirt());
        }
        System.out.println("----UnSorted------");
        for (RandomTShirt randomTShirt : randomTShirts) {
            System.out.println(randomTShirt);
        }
        
        // RandomQS
        List<RandomTShirt> randomTShirts2 = new ArrayList<>(randomTShirts);
        qsRand.sort(randomTShirts2, 0, randomTShirts2.size()-1, true, 2);
        System.out.println("------Sorted------");
        for (RandomTShirt randomTShirt : randomTShirts2) {
            System.out.println(randomTShirt);
        }
        
        // Comparator
        List<RandomTShirt> randomTShirts3 = new ArrayList<>(randomTShirts);
        Collections.sort(randomTShirts3.sort(new RandomTShirt()));
        
        
        
        /*
        1. Size ASC QS, BS, BUS
            a) change/add QS from int[] -> RandomTShirt[] or List<RandomTShirt>
            b) int[] arr from Size of List<RandomTShirt> randTS
                e.g. arr[0] <--- randTS.get(0) XXXXX - WRONG (wrong indexing)
                     arr[0] <-> arr[4] ERRRRRRRROR
            c) Comparable, Comparator
        
        
        */
        
    }
    
    static void doIntQuickSort(QuickSort qs, int[] myArray, int low, int high) {
        System.out.println("-----------QS------------");
         System.out.println(Arrays.toString(myArray));
        qs.sort(myArray, 0, myArray.length - 1);
        System.out.println("-------------------------");
         System.out.println(Arrays.toString(myArray));
    }
    
    static void doIntBubbleSort(BubbleSort bs, int[] myArray) {
        System.out.println("-----------BS------------");
         System.out.println(Arrays.toString(myArray));
        bs.bubbleSort(myArray);
        System.out.println("-------------------------");
         System.out.println(Arrays.toString(myArray));
    }
    
    static void doIntBucketSort(BucketSort bus, int[] myArray) {
        System.out.println("-----------BUS-----------");
        System.out.println(Arrays.toString(myArray));
        int[] busArray = bus.sort(myArray, bus.max_value(myArray));
        System.out.println("-------------------------");
        System.out.println(Arrays.toString(busArray));
    }
    
    private static void printArray(int[] myArray) {
        for (int i : myArray) {
            System.out.println(i);
        }
    }
    
}

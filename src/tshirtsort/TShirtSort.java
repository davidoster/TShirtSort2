/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.RandomTShirt;
import sorting.BubbleSort;
import sorting.BucketSort;
import sorting.QuickSort;

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
        
//        int[] qsArray = myArray.clone(); //Arrays.copyOf(myArray, myArray.length);
//        doIntQuickSort(qs, qsArray, 0, qsArray.length - 1);
//        
//        int[] bsArray = myArray.clone(); Arrays.copyOf(myArray, myArray.length);
//        doIntBubbleSort(bs, bsArray);
//        
//        int[] busArray = myArray.clone();
//        doIntBucketSort(bus, busArray);
        
        RandomTShirt rTShirt1 = new RandomTShirt();
        List<RandomTShirt> randomTShirts = new ArrayList<>();
        for(int i = 0; i < 40; i++) {
            randomTShirts.add(new RandomTShirt());
        }
        for (RandomTShirt randomTShirt : randomTShirts) {
            System.out.println(randomTShirt);
        }
//        System.out.println(randomTShirts);
        
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

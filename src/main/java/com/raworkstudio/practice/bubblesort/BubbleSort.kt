package com.raworkstudio.practice.bubblesort

import com.raworkstudio.practice.core.Algorithm
import java.util.Collections.swap

/**
 * https://www.wikiwand.com/en/Bubble_sort
 */
class BubbleSort : Algorithm {

    override fun getName(): String = "Bubble Sort"

    override fun getDescription(): String = "This is bubble sort"

    override fun sort(arr: ArrayList<Int>): ArrayList<Int> {
        var swappedElements : Boolean;
        do {
            swappedElements = false;
            for (i in 0..arr.size - 2){
                if (arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                    swappedElements = true;
                }
            }
        } while (swappedElements);
        return arr;


    }



}
package com.raworkstudio.practice.insertionsort

import com.raworkstudio.practice.core.Algorithm
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * User: enmanuelreyes
 * Date: 10/28/18
 * Time: 10:47 AM
 */

class InsertionSort : Algorithm {

    override fun getName(): String = "Insertion Sort"

    override fun getDescription(): String = "This is insertion sort"

    override fun sort(arr: ArrayList<Int>): ArrayList<Int> {
        var swappedElements: Boolean;
        var n = arr.size;
        for (i in 1 until n) {
            val key = arr[i]
            var j = i - 1

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j -= 1
            }
            arr[j + 1] = key
        }
        return arr;


    }


}
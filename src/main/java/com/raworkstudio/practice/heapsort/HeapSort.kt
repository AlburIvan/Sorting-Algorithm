package com.raworkstudio.practice.heapsort

import com.raworkstudio.practice.core.Algorithm
import java.util.*
import java.util.Collections.swap

/**
 * Created by IntelliJ IDEA.
 * User: enmanuelreyes
 * Date: 10/29/18
 * Time: 10:17 AM
 *
 * https://github.com/vania-pooh/kotlin-algorithms
 */
class HeapSort : Algorithm {

    private var heapSize = 0;

    override fun getName(): String = "Heap Sort"

    override fun getDescription(): String = "This is heap sort"

    override fun sort(arr: ArrayList<Int>): ArrayList<Int> {
        buildMaxHeap(arr);
        var i: Int = arr.size - 1;
        while (i >= 1) {
            swap(arr, i, 0);
            heapSize--;
            maxHeapify(arr, 0);
            i--;
        }
        return arr;
    }

    private fun buildMaxHeap(arr: ArrayList<Int>) {
        heapSize = arr.size;
        var i: Int = Math.floor(arr.size / 2.0).toInt();
        while (i >= 0) {
            maxHeapify(arr, i);
            i--;
        }
    }

    private fun maxHeapify(arr: ArrayList<Int>, i: Int) {
        var leftElementIndex = left(i);
        var rightElementIndex = right(i);
        var largestElementIndex: Int = i;

        if ((leftElementIndex <= heapSize - 1) && (arr[leftElementIndex] > arr[i])) {
            largestElementIndex = leftElementIndex;
        }

        if ((rightElementIndex <= heapSize - 1) && (arr[rightElementIndex] > arr[largestElementIndex])) {
            largestElementIndex = rightElementIndex;
        }

        if (largestElementIndex != i) {
            swap(arr, i, largestElementIndex);
            maxHeapify(arr, largestElementIndex);
        }
    }


    private fun left(i: Int): Int {
        return 2 * i + 1;
    }

    private fun right(i: Int): Int {
        return 2 * i + 2;
    }

}
package com.raworkstudio.practice.core

import com.raworkstudio.practice.bubblesort.BubbleSort
import com.raworkstudio.practice.quicksort.QuickSort

/**
 * Created by Ivan Alburquerque on 7/3/2017.
 */
class AlgorithmFactory {

    companion object  {

        fun get(algorithm: AlgorithmTypes): Algorithm {

            when(algorithm) {
                AlgorithmTypes.BUBBLE_SORT -> return BubbleSort()
                AlgorithmTypes.QUICK_SORT -> return QuickSort()
            }
        }
    }

}
package com.raworkstudio.practice.core

import com.raworkstudio.practice.`bubble-sort`.BubbleSort

/**
 * Created by Ivan Alburquerque on 7/3/2017.
 */
class AlgorithmFactory {

    companion object  {

        public fun get(algorithm: AlgorithmTypes): Algorithm {

            when(algorithm) {
                AlgorithmTypes.BUBBLE_SORT -> return BubbleSort()

            }
        }
    }

}
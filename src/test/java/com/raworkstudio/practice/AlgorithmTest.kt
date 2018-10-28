package com.raworkstudio.practice

import com.raworkstudio.practice.core.Algorithm
import com.raworkstudio.practice.core.AlgorithmFactory
import com.raworkstudio.practice.core.AlgorithmTypes
import org.junit.Before
import org.junit.Test
import kotlin.system.measureTimeMillis

/**
 * Created by Ivan Alburquerque on 7/3/2017
 */
//@RunWith(JUnit4::class)
class AlgorithmTest {

    val unsortedArrayC1 = arrayListOf(1, 15, 25, 35, 10, 150, 75, 80, 4)
    val unsortedArrayC2 = arrayListOf(1, 15, 25, 35, 10, 150, 75, 80, 4, 255, 1506, 980, 20, 70, 35, 25, 34, 60, 459, 662, 99, 320, 510, 833)
    val unsortedArrayC3 = arrayListOf(1, 15, 25, 35, 10, 150, 75, 80, 4)

    @Before
    fun setUp() {
        // implement setup
    }

    @Test
    fun `Testing Bubble Sort with Complexity 1`(): Unit {

        val algorithm = AlgorithmFactory.get(AlgorithmTypes.BUBBLE_SORT)

        assert( executeAlgorithm(algorithm, unsortedArrayC1))
    }

    @Test
    fun `Testing Insertion Sort with Complexity 1`(): Unit {

        val algorithm = AlgorithmFactory.get(AlgorithmTypes.INSERTION_SORT)

        assert( executeAlgorithm(algorithm, unsortedArrayC1))
    }


    @Test
    fun `Testing Quick Sort with Complexity 1`(): Unit {

        val algorithm = AlgorithmFactory.get(AlgorithmTypes.QUICK_SORT)

        assert( executeAlgorithm(algorithm, unsortedArrayC1))
    }

    @Test
    fun `Testing Sleep Sort with Complexity 1`(): Unit {

        val algorithm = AlgorithmFactory.get(AlgorithmTypes.SLEEP_SORT)

        assert( executeAlgorithm(algorithm, unsortedArrayC1))
    }

    private fun executeAlgorithm(algorithm: Algorithm, unsortedArray: ArrayList<Int>): Boolean {

        var sortedArray = arrayListOf<Int>()

        println("Algorithm Name: ${algorithm.getName()}")
        println("Algorithm Description: ${algorithm.getDescription()}")
        println("Unsorted Algorithm: $unsortedArray")

        val elapsedTime = measureTimeMillis {
            sortedArray = algorithm.sort(array = unsortedArray)
            println("Sorted Algorithm: $sortedArray")
        }

        println("Finished in: $elapsedTime")

        return unsortedArrayC1.toArray() contentEquals sortedArray.toArray()
    }
}
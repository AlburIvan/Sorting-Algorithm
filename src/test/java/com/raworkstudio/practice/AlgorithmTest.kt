package com.raworkstudio.practice

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

    @Before
    fun setUp() {
        // implement setup
    }

    @Test
    fun `Testing Bubble Sort`(): Unit {

        var sortedArray = arrayListOf<Int>()
        val unsortedArray = arrayListOf(1, 15, 25, 35, 10, 150, 75, 80, 4)
        val algorithm = AlgorithmFactory.get(AlgorithmTypes.BUBBLE_SORT)

        println("Algorithm Name: ${algorithm.getName()}")
        println("Algorithm Description: ${algorithm.getDescription()}")

        val elapsedTime = measureTimeMillis {
            sortedArray = algorithm.sort(array = unsortedArray)
            println(sortedArray)
        }

        println("Finished in: $elapsedTime")
        val areEqual = unsortedArray.toArray() contentEquals sortedArray.toArray()
        assert(areEqual)
    }


}
package com.raworkstudio.practice.sleepsort

import com.raworkstudio.practice.core.Algorithm
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * https://rosettacode.org/wiki/Sorting_algorithms/Sleep_sort
 */
class SleepSort : Algorithm {

    override fun getName(): String = "Sleep Sort"

    override fun getDescription(): String = "This is sleep sort"

    override fun sort(nums: IntArray): ArrayList<Int> {
        val sortedList = ArrayList<Int>()
        val taskExecutor = Executors.newFixedThreadPool(nums.size)
        for (num in nums) {
            taskExecutor.execute {
                try {
                    Thread.sleep((num * 1000).toLong())
                    sortedList.add(num)
                } catch (e: InterruptedException) {

                }
            }
        }
        taskExecutor.shutdown()
        try {
            taskExecutor.awaitTermination(java.lang.Long.MAX_VALUE, TimeUnit.NANOSECONDS)
        } catch (e: InterruptedException) {
        }

        return sortedList
    }
}
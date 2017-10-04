package com.raworkstudio.practice.sleepsort

import com.raworkstudio.practice.core.Algorithm

/**
 * https://rosettacode.org/wiki/Sorting_algorithms/Sleep_sort
 */
class SleepSort : Algorithm {

    override fun getName(): String = "Sleep Sort"

    override fun getDescription(): String = "This is sleep sort"

    override fun sort(array: ArrayList<Int>): ArrayList<Int> {
        val sortedList = ArrayList<Int>()
        for (num in nums) {
            try {
                Thread.sleep((num * 1000).toLong())
                sortedList.add(num)
            } catch (e: InterruptedException) {

            }
        }
        return sortedList
    }
}
package fr.fizzbuzz

class Number(private val value: Int = 0) {
  fun isMultipleOf(multiplicities: Array<Int>): Boolean = value != 0 && multiplicities.all { value%it == 0 }
}
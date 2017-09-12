package fr.fizzbuzz

class Number(val value: Int = 0) {
  fun isMultipleOfThree(): Boolean {
    return when (value) {
      3 -> true
      else -> false
    }
  }
}
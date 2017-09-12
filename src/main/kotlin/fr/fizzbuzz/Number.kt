package fr.fizzbuzz

class Number(val value: Int = 0) {
  fun isMultipleOfThree(): Boolean {
    return when {
      value != 0 && value%3 == 0 -> true
      else -> false
    }
  }
}
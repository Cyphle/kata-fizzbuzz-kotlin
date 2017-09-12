package fr.fizzbuzz

class Number(val value: Int = 0) {
  fun isMultipleOf(multiplicity: Int): Boolean = value != 0 && value%multiplicity == 0
}
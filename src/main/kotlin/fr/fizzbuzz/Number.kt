package fr.fizzbuzz

class Number(val value: Int = 0) {
  fun isMultipleOf(vararg multiplicity: Int): Boolean = value != 0 && multiplicity.all { value%it == 0 }
}
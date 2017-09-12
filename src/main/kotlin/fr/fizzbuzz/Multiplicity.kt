package fr.fizzbuzz

enum class Multiplicity(val multiplicities: Array<Int>, val word: String) {
  THREE(arrayOf(3), "Fizz"),
  FIVE(arrayOf(5), "Buzz"),
  THREE_FIVE(arrayOf(3, 5), "FizzBuzz")
}

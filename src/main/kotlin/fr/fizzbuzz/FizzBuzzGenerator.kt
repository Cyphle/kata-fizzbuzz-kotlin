package fr.fizzbuzz

import java.util.stream.IntStream

class FizzBuzzGenerator {
  fun generate(end: Int): String {
    val result = mutableListOf<String>()
    IntStream.rangeClosed(1, end)
            .forEach { result.add(getWordFor(it)) }
    return result.joinToString(" ")
  }

  private fun getWordFor(element: Int): String {
    return Multiplicity.values()
            .findLast { Number(element).isMultipleOf(it.multiplicities) }?.word ?: element.toString()
  }
}
package fr.fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NumberTest {
  @Test
  fun `should return false if number is 0 and tested against multiple of 3`() {
    val number = Number()
    assertThat(number.isMultipleOf(arrayOf(3))).isFalse()
  }

  @Test
  fun `should return true if number is 3 and tested against multiple of 3`() {
    val number = Number(3)
    assertThat(number.isMultipleOf(arrayOf(3))).isTrue()
  }

  @Test
  fun `should return false if number is not a multiple of 3 and tested against a multiple of 3`() {
    val number = Number(4)
    assertThat(number.isMultipleOf(arrayOf(3))).isFalse()
  }

  @Test
  fun `should return true if number is a multiple of 3`() {
    val number = Number(15)
    assertThat(number.isMultipleOf(arrayOf(3))).isTrue()
  }

  @Test
  fun `should return false if number is not a multiple of 5`() {
    val number = Number(4)
    assertThat(number.isMultipleOf(arrayOf(5))).isFalse()
  }

  @Test
  fun `should return true if multiple of 5`() {
    val number = Number(15)
    assertThat(number.isMultipleOf(arrayOf(5))).isTrue()
  }

  @Test
  fun `should return true if multiple of 3 and 5`() {
    val number = Number(15)
    assertThat(number.isMultipleOf(arrayOf(3, 5))).isTrue()
  }
}
package fr.fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NumberTest {
  @Test
  fun `should return false if number is 0 and tested against multiple of 3`() {
    val number = Number()
    assertThat(number.isMultipleOfThree()).isFalse()
  }

  @Test
  fun `should return true if number is 3 and tested against multiple of 3`() {
    val number = Number(3)
    assertThat(number.isMultipleOfThree()).isTrue()
  }

  @Test
  fun `should return false if number is not a multiple of 3 and tested against a multiple of 3`() {
    val number = Number(4)
    assertThat(number.isMultipleOfThree()).isFalse()
  }

  @Test
  fun `should return true if number is a multiple of 3`() {
    val number = Number(15)
    assertThat(number.isMultipleOfThree()).isTrue()
  }

  @Test
  fun `should return false if number is not a multiple of 5`() {
    val number = Number(4)
    assertThat(number.isMultipleOfFive()).isFalse()
  }
}
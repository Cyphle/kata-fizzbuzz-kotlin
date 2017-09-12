package fr.fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NumberTest {
  @Test
  fun `should return false if number is 0 and tested against multiple of 3`() {
    val number = Number()
    assertThat(number.isMultipleOfThree()).isFalse();
  }

  @Test
  fun `should return true if number is 3 and tested against multiple of 3`() {
    val number = Number(3)
    assertThat(number.isMultipleOfThree()).isTrue();
  }
}
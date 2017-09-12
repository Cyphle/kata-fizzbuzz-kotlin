package fr.fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzGeneratorTest {
  private val generator = FizzBuzzGenerator()

  @Test
  fun `should generate suite of 1 2`() {
    assertThat(generator.generate(2)).isEqualTo("1 2")
  }

  @Test
  fun `should generate suite of 1 to 4`() {
    assertThat(generator.generate(4)).isEqualToIgnoringCase("1 2 Fizz 4")
  }

  @Test
  fun `should generate suite of 1 to 20`() {
    assertThat(generator.generate(20)).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz");
  }
}


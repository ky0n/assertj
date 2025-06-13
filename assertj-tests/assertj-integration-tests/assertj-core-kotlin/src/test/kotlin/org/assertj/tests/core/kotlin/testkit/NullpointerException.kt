package org.assertj.tests.core.kotlin.testkit

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


class NullpointerException() {

  @Test
  fun assertNullValue() {
    val dataClass = Data(null)
    assertThat { dataClass.name }.isNull()
  }
}

package org.assertj.tests.core.kotlin.testkit

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


class NullpointerException() {

  /// Double Type

  @Test
  fun assertNullValue1() {
    val doubleTypeClass = DoubleType(null)
    println(doubleTypeClass)
    assertThat(doubleTypeClass.value).isNull()
  }

  @Test
  fun assertNullValue2() {
    val doubleTypeClass = DoubleType(null)
    println(doubleTypeClass)
    assertThat(doubleTypeClass.value()).isNull()
  }

  @Test
  fun assertNullValue3() {
    val doubleTypeClass = DoubleType(null)
    println(doubleTypeClass)
    assertThat { doubleTypeClass.value() } .isNull()
  }

  @Test
  fun assertNullValue4() {
    val doubleTypeClass = DoubleType(3.0)
    println(doubleTypeClass)
    assertThat { doubleTypeClass.value() } .isNull()
  }

  /// String Type

  @Test
  fun assertNullValue5() {
    val stringTypeClass = StringType(null)
    println(stringTypeClass)
    assertThat(stringTypeClass.value()).isNull()
  }

  @Test
  fun assertNullValue6() {
    val stringTypeClass = StringType(null)
    println(stringTypeClass)
    assertThat(stringTypeClass.value).isNull()
  }

  @Test
  fun assertNullValue7() {
    val doubleTypeClass = StringType(null)
    println(doubleTypeClass)
    assertThat { doubleTypeClass.value() } .isNull()
  }

  @Test
  fun assertNullValue8() {
    val doubleTypeClass = StringType("SomeValue")
    println(doubleTypeClass)
    assertThat { doubleTypeClass.value() } .isNull()
  }
}

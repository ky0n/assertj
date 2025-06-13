package org.assertj.tests.core.data;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.sun.jdi.DoubleType;

public class TestNullPrimitiveTypeRecord {


  @Test
  public void testNullPrimitiveTypeRecord() {
    record Test(DoubleType value) {
    }
    var test = new Test(null);

    assertThat(test.value).isNull();
  }

}

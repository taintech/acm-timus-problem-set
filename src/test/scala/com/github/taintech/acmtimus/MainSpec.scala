package com.github.taintech.acmtimus

import org.scalatest.{ FlatSpec, Matchers }

class MainSpec extends FlatSpec with Matchers {

  "2 * 3 " should "return 6" in {
    (2 * 3) should be(6)
  }

}

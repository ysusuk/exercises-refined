package templatelib

import org.scalacheck.Shapeless._
import org.scalaexercises.Test
import org.scalatest.Spec
import org.scalatest.prop.Checkers
import shapeless.HNil

class MyLibrarySpec extends Spec with Checkers {
  def `function asserts` = {
    check(Test.testSuccess(SectionA.functionAssert _, true :: HNil))
  }

  def `function false asserts` = {
    check(Test.testSuccess(SectionA.functionFalseAssert _, false :: HNil))
  }
}
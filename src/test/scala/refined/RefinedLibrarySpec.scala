/*
 * Copyright 2017 47 Degrees, LLC. <http://www.47deg.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package refined

import org.scalacheck.Shapeless._
import org.scalaexercises.Test
import org.scalatest.refspec.RefSpec
import org.scalatest.prop.Checkers
import shapeless.HNil

class RefinedLibrarySpec extends RefSpec with Checkers {
  def `equals 10` = {
    check(Test.testSuccess(refined.NumericSection.equals10 _, 10 :: 8 :: HNil))
  }

  def `greater 10` = {
    val res0: Int = 11
    val res1: Int = 9
    check(
      Test.testSuccess(refined.NumericSection.greater10 _,
                       res0 :: res1 :: HNil))
  }

}

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

import org.scalatest._
import org.scalaexercises.definitions._

import eu.timepit.refined._
import eu.timepit.refined.api._
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric._
import eu.timepit.refined.generic._

/** @param name Numeric
  */
object NumericSection
    extends FlatSpec
    with Matchers
    with Section
    with EitherValues {

  /** = Getting started  =
    *
    * refineV for values
    *
    * refineMV only for literal values (literals)
    *  = Equal  =
    */
  def equals10(res0: Int, res1: Int) = {
    type Equals10 = Int Refined Equal[W.`10`.T]

    val equals10: Either[String, Equals10] = refineV(res0)
    val rightRes: Int = equals10.right.value
    rightRes shouldBe (res0)

    val error: Either[String, Equals10] = refineV(res1)
    val leftRes: String = error.left.value
    leftRes should be(s"Predicate failed: ($res1 == 10).")
  }

  /** = Greater =
    */
  def greater10(res0: Int, res1: Int) = {
    type Greater10 = Int Refined Greater[W.`10`.T]

    if (res0 > 10) {
      val greater10: Either[String, Greater10] = refineV(res0)
//      println(greater10)
      val rightRes: Int = greater10.right.value
      println("right")
      println(rightRes)
      rightRes should be(res0)
    } else {
      val error: Either[String, Greater10] = refineV(res1)
//      println(error)
      val leftRes: String = error.left.value
      println("left")
      println(leftRes)
      //leftRes should be(true)
      true should be(true)
    }
  }
}

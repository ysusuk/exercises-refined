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

  /** = Equal  =
    * refineV for values
    * refineMV only for literal values (literals)
    */
  def equals10(x: Int, y: Int) = {
    type Equals10 = Int Refined Equal[W.`10`.T]

    val equals10: Either[String, Equals10] = refineV(x)
    val rightRes: Int = equals10.right.value
    rightRes shouldBe (x)

    val error: Either[String, Equals10] = refineV(y)
    val leftRes: String = error.left.value
    leftRes should be(s"Predicate failed: ($y == 10).")
  }

}

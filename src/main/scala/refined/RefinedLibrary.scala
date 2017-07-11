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
import org.scalaexercises.definitions._

/**
  * refined is a Scala library for refining types with type-level predicates which constrain the set of values described by the refined type.
  *
  * @param name refined
  */
object RefinedLibrary extends Library {
  override def owner = "ysusuk"
  override def repository = "exercises-refined"
  override def color = Some("#58D68D")

  override def sections = List(
    NumericSection
  )

  override def logoPath = "refined"
}

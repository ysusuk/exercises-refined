package templatelib
import org.scalaexercises.definitions._

/** This is the description of the library as it will appear in the Scala Exercises website.
  *
  * @param name template
  */
object MyLibrary extends Library {
  override def owner = "scala-exercises"
  override def repository = "scala-exercises"
  override def color = Some("#323232")

  override def sections = List(
    SectionA
  )
}

package ch9

import scala.io.Source

object FileReverse {
  def reverse(filename: String):Array[String] = Source.fromFile(filename).getLines().toArray.reverse

}

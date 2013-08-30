package ch5

abstract class Conversion {
  def convert(value:Int):Int
}

object Inches2Centimetres extends Conversion {
  def convert(value: Int): Int = value
}

package ch5

object Suits extends Enumeration {
  def isRed(value: Suits.Value): Boolean = value==HEARTS||value==DIAMONDS

  type Suit =  Value
  val HEARTS = Value(0,"A")
  val CLUBS = Value(1,"B")
  val SPADES = Value(2,"C")
  val DIAMONDS = Value(3,"D")

}

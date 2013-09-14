package ch5

import org.scalatest.{FunSpec, FunSuite}

class Suits$Test extends FunSpec {

  describe("Check what hearts") {
    it("is") {
      assert("A"==Suits.HEARTS.toString)
    }
  }

  describe("the isRed functionn when called") {
    it{"should return true for hearts and diamonds, false otherwise"} {
      assert(true===Suits.isRed(Suits.HEARTS))
      assert(true===Suits.isRed(Suits.DIAMONDS))
      assert(false===Suits.isRed(Suits.CLUBS))
      assert(false===Suits.isRed(Suits.SPADES))
    }
  }

}

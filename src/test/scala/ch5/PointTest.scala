package ch5

import org.scalatest.FunSpec

class PointTest extends FunSpec {


  describe("When Point(3,4) is called it") {
    it ("should create a new Point object with x=3, y=4") {
      val p = Point(3,4)
      assert(3==p.x)
      assert(4==p.y)
    }
  }

}

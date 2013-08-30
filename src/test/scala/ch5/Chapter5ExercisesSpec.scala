package ch5

import org.scalatest.FunSpec

class Chapter5ExercisesSpec extends FunSpec {

  describe("When inchesToCentimetres.convert is called") {
    it ("should convert correctly") {
      assert(6 === Inches2Centimetres.convert(6))
      assert(12 === Inches2Centimetres.convert(12))
    }
  }

}

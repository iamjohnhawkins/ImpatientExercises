package ch4

import org.scalatest.FunSpec


class ExercisesSpec extends FunSpec {
  def ONE: String = "one"
  def TWO: String = "two"
  def THREE: String = "three"
  describe("When reduceBy10Pct is called on a map of (gizmo, prices)") {
    it("should reduce the price by 10%") {
      val myGizmos = Map("ipad" -> 100.00, "iphone" -> 1000.00)
      val myGizmosReduced = Map("ipad" -> 90.00, "iphone" -> 900.00)
      assert(myGizmosReduced === Exercises.reduceBy10Pct(myGizmos))
    }
  }

  describe("When it reads my test file") {
    it("should count exactly 10 words") {
      assert(10 === Exercises.wordcounter("src/test/resources/word_count.txt"))
    }
  }

  describe("When it reads my test file") {
    it("the expected frequency map should match") {
      val expected = Map(ONE -> 3, TWO -> 4, THREE -> 3)
      assert(expected === Exercises.frequencyCounter("src/test/resources/word_count.txt"))
    }
  }

  describe("When it reads my test file") {
    it ("should print the results in sorted order") {
      val expected = List(ONE,"three", TWO);
      val returnedMap =  Exercises.frequencyCounter("src/test/resources/word_count.txt");
      val keyIter = returnedMap.keys.toList;

      assert(expected === keyIter);

    }
  }
}

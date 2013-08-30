package ch3

import org.scalatest.FunSpec
import collection.mutable.ArrayBuffer
import collection.mutable.Buffer
import org.scalatest.matchers.{BePropertyMatcher, BePropertyMatchResult}
import org.scalatest.matchers.ShouldMatchers._

class Chapter3ExercisesSpec extends FunSpec{

  def anInstanceOf[T](implicit manifest: Manifest[T]) = {
        val clazz = manifest.erasure.asInstanceOf[Class[T]]
        new BePropertyMatcher[AnyRef] { def apply(left: AnyRef) =
      BePropertyMatchResult(left.getClass.isAssignableFrom(clazz), "an instance of " + clazz.getName) }
      }

  describe("When randomArray(5) is called") {
    it("should return an array of length 5") {
      assert(5 === Chapter3Exercises.randomArray(5).length)
    }
  }
  describe("When randomArray(5) is called") {
    it("all numbers in it should be between 0 and 5(exc)should return an array of length 5") {
      val randArray = Chapter3Exercises.randomArray(5)
      val filtered = for(i<-randArray if ((i>=0) && (i<5))) yield i
      assert(randArray === filtered)
    }
  }
  describe("When switcheroo is called on an Array(1,2,3,4,5)") {
    it("should make the array (2,1,4,3,5)") {
      val ourArray = Array(1,2,3,4,5)
      Chapter3Exercises.switcheroo(ourArray)
      assert(Array(2,1,4,3,5)===ourArray)
    }
  }
  describe("When switcheroo2 is called on an Array(1,2,3,4,5)") {
    it("it should leave the original array unchanged and return new array (2,1,4,3,5)") {
      val ourArray = Array(1,2,3,4,5)
      val newArray = Chapter3Exercises.switcheroo2(ourArray)
      assert(Array(2,1,4,3,5)===newArray)
      assert(Array(1,2,3,4,5)===ourArray)
    }
  }
  describe("When weirdSort is called on Array(-1,-2,-3,0,1,2,3,4)") {
    it("it should return an Array(1,2,3,4,-1,-2,-3,0)") {
      assert(Array(1,2,3,4,-1,-2,-3,0) === Chapter3Exercises.weirdSort(Array(-1,-2,-3,0,1,2,3,4)))
    }
  }
  describe("When average is called on Array(0.0,1.0,2.0)") {
    it("should return 1.0") {
      assert(1.0 === Chapter3Exercises.average(Array(0.0,1.0,2.0)))
    }
  }
  describe("When reverseSort is called on Array(0,1,2,3,4,5,6)") {
    it("should return Array(6,5,4,3,2,1,0)") {
      assert(Array(6,5,4,3,2,1,0) === Chapter3Exercises.reverseSort(Array(0,1,2,3,4,5,6)))
    }
  }
  describe("When distinct is called on Array(0,0,1,1,2,2)") {
    it("should return Array(0,1,2)") {
      assert(Array(0,1,2) === Chapter3Exercises.distinct(Array(0,0,1,1,2,2)))
    }
  }

  describe("When removeAllButFirstNegative is called on ArrayBuffer(-1,1,2,3,-3,2,-1") {
    it("should return ArrayBuffer(-1,1,2,3,2") {
      assert(ArrayBuffer(-1,1,2,3,2) === Chapter3Exercises.removeAllButFirstNegative(ArrayBuffer(-1,1,2,3,-3,2,-1)))

    }
  }
  describe("When removeAllButFirstNegativeReworked is called on ArrayBuffer(-1,1,2,3,-3,2,-1") {
    it("should return ArrayBuffer(-1,1,2,3,2") {
      assert(ArrayBuffer(-1,1,2,3,2) === Chapter3Exercises.removeAllButFirstNegativeReworked(ArrayBuffer(-1,1,2,3,-3,2,-1)))

    }
  }

  describe("When allAmericanTimezones is called") {
    it("it should return ...") {
      assert(Chapter3Exercises.allAmericanTimezones().contains("Nome"))
      for(tz <- Chapter3Exercises.allAmericanTimezones()) println(tz)
    }
  }
  describe("when flavourmap is called") {
    it("should return a non-empty scala buffer of strings") {
      val returnVal = Chapter3Exercises.flavourMap()
      assert(returnVal.nonEmpty)
    }
  }
}

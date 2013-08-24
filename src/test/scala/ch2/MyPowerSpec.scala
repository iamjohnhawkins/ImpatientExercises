package ch2

import org.scalatest.FunSpec


class MyPowerSpec extends FunSpec{

  describe("When calling power(2,0)") {
    it("should return 1"){
      assert(1===MyPower.power(2,0))
    }
  }
  describe("When calling power(2,2)") {
    it("should return 4"){
      assert(4===MyPower.power(2,2))
    }
  }
  describe("When calling power(2,3)") {
    it("should return 8"){
      assert(8===MyPower.power(2,3))
    }
  }
  describe("When calling power(2,8)") {
    it("should return 256"){
      assert(256===MyPower.power(2,8))
    }
  }
  describe("When calling power(2,-1)") {
    it("should return 0.5"){
      assert(0.5===MyPower.power(2,-1))
    }
  }
}

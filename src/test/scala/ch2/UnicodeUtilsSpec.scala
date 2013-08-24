package ch2

import org.scalatest.FunSpec

class UnicodeUtilsSpec extends FunSpec {
  describe("When asked for the unicodeProduct of Hello") {
    it("should return 9415087488L") {
      assert(9415087488L === UnicodeUtils.unicodeProduct("Hello"))
    }
  }
  describe("When asked for the UnicodeProductWithoutFor of Hello") {
    it("should return 9415087488L") {
      assert(9415087488L === UnicodeUtils.unicodeProductWithoutFor("Hello"))
    }
  }
  describe("When asked for the UnicodeProductRecursive of Hello") {
    it("should return 9415087488L") {
      assert(9415087488L === UnicodeUtils.unicodeProductRecursive("Hello"))
    }
  }
  describe("When asked for the UnicodeProductRecursive of an empty string") {
    it("should return 0L") {
      assert(0L === UnicodeUtils.unicodeProductRecursive(""))
    }
  }
}

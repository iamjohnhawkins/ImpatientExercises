package ch9

import org.scalatest.FunSpec

class FileReverseTest extends FunSpec {
  describe("When reverse is called on the test file") {
    it("should a return a string array of the lines in reverse order") {
      val reversedLines = FileReverse.reverse("src/test/resources/ch9_file_reverse.txt")
      assert(3 === reversedLines.size)
      assert("Third Line"===reversedLines(0))
    }
  }

}

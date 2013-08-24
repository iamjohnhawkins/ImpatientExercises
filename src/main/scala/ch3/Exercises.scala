package ch3

import util.{Sorting, Random}
import collection.mutable.ArrayBuffer
import java.awt.datatransfer._
import collection.mutable.Buffer
import scala.collection.JavaConversions.asScalaBuffer

object Exercises {

  // exercise 1
  def randomArray(n: Int): Array[Int] =  Array.fill(n) {Random.nextInt(5)}

  // exercise 2
  def switcheroo(b:Array[Int]) = {
    for (i<-1 until (b.length, 2)) {
      val tmp = b(i-1)
      b(i-1)=b(i)
      b(i)=tmp
    }
    b
  }
  // exercise 3
  def switcheroo2(b:Array[Int]) = {
    val vec = for (i<-0 until b.length) yield if (i%2 == 0) {if (i<b.length-1) b(i+1) else b(i)} else b(i-1)
    vec.toArray

  }

  // exercise 4
  def weirdSort(ints: Array[Int]) = {
    Array.concat(for (i <- ints if i > 0) yield i, for (i <- ints if i <= 0) yield i)
  }

  // exercise 5
  def average(ar:Array[Double]):Double = ar.sum/ar.length

  // exercise 6
  def reverseSort(ints: Array[Int]):Array[Int] = ints.sortWith(_ > _)
  def reverseSortBuffer(ints: ArrayBuffer[Int]):ArrayBuffer[Int] = ints.sortWith(_ > _)

  // exercise 7
  def distinct(ar:Array[Int]):Array[Int] = ar.distinct

  //exercise 8
  def removeAllButFirstNegative(a:ArrayBuffer[Int]):ArrayBuffer[Int] = {
    var first = true
    val indexes = for (i <- 0 until a.length if first || a(i) >= 0) yield {
      if (a(i) < 0) first = false; i
    }
    for (j <- 0 until indexes.length) a(j) = a(indexes(j))
    a.trimEnd(a.length - indexes.length)
    a
  }
  def removeAllButFirstNegativeReworked(a:ArrayBuffer[Int]):ArrayBuffer[Int] = {
    val indexes = for (i <- 0 until a.length if  a(i) < 0) yield i
    val reversed = indexes.reverse.dropRight(1)
    for (j <- 0 until reversed.length) a.remove(reversed(j))
    a
  }
  def allAmericanTimezones():Array[String] = {
    val allTimezones = java.util.TimeZone.getAvailableIDs()
    val americanTimezones = for (a <- allTimezones if (a.startsWith("America/"))) yield a.stripPrefix("America/")
    Sorting.quickSort(americanTimezones)
    americanTimezones
  }
  def flavourMap():Buffer[String] = {
    val flavours = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    flavours.getNativesForFlavor(DataFlavor.getTextPlainUnicodeFlavor);
  }
}

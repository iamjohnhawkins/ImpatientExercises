package ch4

import java.io.File
import scala.collection.immutable.SortedMap


object Exercises {
  def wordcounter(fileName: String): Int = {
    var counter =0;
    val in = new java.util.Scanner(new File(fileName))
    while(in.hasNext()) {
      counter+=1
      in.next()
    }
    counter
  }
  def frequencyCounter(fileName: String): Map[String,Int] = {
    var wordMap = SortedMap[String,Int]()
    val in = new java.util.Scanner(new File(fileName))
    while(in.hasNext()) {
      val thisWord:String = in.next()
      val frequency = wordMap.getOrElse(thisWord,0) + 1
      wordMap += (thisWord -> frequency)
    }
    wordMap
   }

  def reduceBy10Pct(map: Map[String, Double]) = {
    for ((gizmo,price)<-map ) yield (gizmo,price*0.9)

  }

}

import ch3.Chapter3Exercises
import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()
b += 1
b += (1,2,3,5)
b ++= Array(8, 13, 21)
b.trimEnd(5)
val b2= Chapter3Exercises.randomArray(10)



println(Chapter3Exercises.switcheroo(b2).mkString(","))


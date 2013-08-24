import ch3.Exercises
import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()
b += 1
b += (1,2,3,5)
b ++= Array(8, 13, 21)
b.trimEnd(5)
val b2= Exercises.randomArray(10)



println(Exercises.switcheroo(b2).mkString(","))


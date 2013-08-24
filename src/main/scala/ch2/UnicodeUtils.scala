package ch2

object UnicodeUtils {


def unicodeProduct(s:String):Long = {
  var x:Long=1
  for(c<-s) x*=c.toInt
  return x
}
  def unicodeProductWithoutFor(s:String):Long = s.foldLeft(1L)(_ * _.toInt)

  def unicodeProductRecursive(s:String):Long = {
    def unicodeProductRecursive0(s:String,total:Long):Long = {
      if (s.isEmpty) total else unicodeProductRecursive0(s.tail,total*s.head.toInt)
    }
    if (s.isEmpty()) 0 else unicodeProductRecursive0(s,1L)
  }
}
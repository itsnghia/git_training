package example

import scala.collection.mutable.ListBuffer

object Main extends App {
  // Type safe exercise
  def printTypeSafe(x: Int): Unit = {
    var nums = ListBuffer[Any]()
    for (i <- 1 to x) {
      i match {
        case i if i % 3 == 0 && i % 5 == 0 => nums += "typesafe"
        case i if i % 3 == 0 => nums += "type"
        case i if i % 5 == 0 => nums += "safe"
        case _ => nums += i
      }
    }
  }


}


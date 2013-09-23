package study0000

import scala.util.control.Breaks.{ break, breakable }

object MainWhile {
  def main(args: Array[String]): Unit = {
    var v0: Int = 0
    while (v0 < 10) {
      println("v0:" + v0)
      v0 += 1
    }

    // scalaのbreakは面倒
    var v1: Int = 0
    breakable {
      while (true) {
        println("v1:" + v1)
        v1 += 1
        if (v1 >= 10) {
          break;
        }
      }
    }
  }
}
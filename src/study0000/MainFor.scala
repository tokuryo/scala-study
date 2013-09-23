package study0000

import scala.util.control.Breaks.{ break, breakable }

object MainFor {
  def main(args: Array[String]): Unit = {
    for (i: Int <- 1 to 5) {
      println("x" + i)
    }

    // scalaのbreakは面倒。
    // scalaでは、breakはあまり好まれない？
    breakable {
      for (i: Int <- 1 to 5) {
        if (i == 3) {
          break;
        }
        println("y" + i)
      }
    }

    // scalaには、continueが無い。continue相当。
    for (i: Int <- 1 to 5) {
      breakable {
        if (i == 3) {
          break;
        }
        println("z" + i)
      }
    }

  }
}
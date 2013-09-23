package study0000

object MainIf {
  def main(args: Array[String]): Unit = {
    if (true) {
      println("true0")
    } else {
      println("false0")
    }

    //  if式は値を返す
    val v0: Int = if (true) {
      println("true1")
      10
    } else {
      println("false1")
      20
    }
    println("v0:" + v0)
  }
}
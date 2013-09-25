package study002

object MainArray {

  def main(args: Array[String]): Unit = {
    println("ArraySample")
    val a1 = new Array[Int](3)
    println("a1.length:" + a1.length)
    println(a1(0))
    println(a1(1))
    println(a1(2))
    a1(0) = 100
    println(a1(0))

    val a2 = Array(1, 2, 3, 4)
    println("a2.length" + a2.length)
    println(a2(0))
    println(a2(3))

  }
}

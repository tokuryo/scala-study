package study003

// Javaの配列相当。
object MainArray {

  def main(args: Array[String]): Unit = {
    println("ArraySample")
    val a1 = new Array[Int](3)
    println("a1.length : " + a1.length)
    println("a1(0) : " + a1(0))
    println("a1(1) : " + a1(1))
    println("a1(2) : " + a1(2))
    // ミュータブル。但し長さは変更できない。
    a1(0) = 100
    println("a1(0)代入後 : " + a1(0))

    println()
    // 初期値を与える例
    val a2 = Array(2, 3, 9, 7)
    println("a2.length : " + a2.length)
    println("a2(0) : " + a2(0))
    println("a2(1) : " + a2(1))
    println("a2(2) : " + a2(2))
    println("a2(3) : " + a2(3))
  }
}

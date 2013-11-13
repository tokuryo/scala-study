package study003

// イミュータブルなSet
object MainSet {
  def main(args: Array[String]): Unit = {
    val set00 = Set("hoge", "foo", "hoge")
    println("set00 : " + set00)
    println("contains foo : " + set00.contains("foo"))
    val set01 = set00 + "bar"
    println("set01 : " + set01)

  }
}

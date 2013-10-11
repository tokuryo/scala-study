package study006

object MainSugar {
  def main(args: Array[String]) {
    // メソッドの引数が１つだけなら、ドットと括弧を省略できる。
    val one = 1
    val ten = 10
    val val010 = one.to(ten)
    val val011 = one to ten
  }
}

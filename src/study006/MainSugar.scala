package study006

object MainSugar {
  def main(args: Array[String]) {
    // メソッドの引数が１つだけなら、ドットと括弧を省略できる。
    val one = 1
    val ten = 10
    val val010 = one.to(ten)
    val val011 = one to ten

    val array = Array(1, 2, 3, 4)
    // applyを省略できる。下記の２行は同じ意味。
    println(array.apply(0))
    println(array(0))

    // 代入の場合、updateを省略できる。下記の２行は同じ意味。
    array.update(0, 10)
    array(0) = 10
  }
}

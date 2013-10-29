package study006

object MainSugar {
  def main(args: Array[String]) {
    // メソッドの引数が１つだけなら、ドットと括弧を省略できる。
    val one = 1
    val ten = 10
    val range01 = one.to(ten)
    println("range01 : " + range01)
    val range02 = one to ten
    println("range02 : " + range02)

    val array = Array(1, 2, 3, 4)
    // applyメソッドの呼び出しは、"apply"の記述を省略できる。下記の２行は同じ意味。
    println("array.apply(0) : " + array.apply(0))
    println("array(0) : " + array(0))

    // updateメソッドの代わりに = で代入できる。下記の２行は同じ意味。
    array.update(0, 10)
    array(0) = 10
    println("代入後 array(0) : " + array(0))
  }
}

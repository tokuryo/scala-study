package study001

// http://www.ne.jp/asahi/hishidama/home/tech/scala/expression.html
object MainEnzansi {

  def main(args: Array[String]) {
    println("演算子")
    println("2 + 3 * 4 = " + (2 + 3 * 4))
    println("(7 + 3) / 5 = " + ((7 + 3) / 5))
    println("!true : " + !true)

    // scala にインクリメント i++ は無い
    println("インクリメント")
    var i: Int = 0
    i += 1
    println(i)
    i = i + 1
    println(i)

    // 比較演算子
    println("比較演算子")
    println("1 < 3 : " + (1 < 3))
    println("1 > 3 : " + (1 > 3))
    println("2 >= 2 : " + (2 >= 2))
    println("5 == 5 : " + (5 == 5))
    println("1 != 2 : " + (1 != 2))
    println("false & true : " + (false & true))
    println("1 > 3 && 2 < 5 : " + (1 > 3 && 2 < 5))
    println("2 < 5 || 1 > 3 : " + (2 < 5 || 1 > 3))

    // Javaとは違って、scala では、isInstanceOfメソッド
    println("isInstanceOf : " + "a".isInstanceOf[String])
  }

}
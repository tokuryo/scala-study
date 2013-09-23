package study0000

object MainSemicolon {
  def main(args: Array[String]): Unit = {
    // 行の最後のセミコロンは省略できる。
    val v0: Int = 1 + 1 + 1
    println("v0:" + v0)

    // 行の最後が演算子なので、次の行へ処理が継続される
    val v1: Int = 1 + 1 +
      1
    println("v1:" + v1)

    // セミコロンが存在するものとして解釈される
    val v2: Int = 1 + 1
    // +1
    println("v2:" + v2)
  }
}
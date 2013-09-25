package study002

// http://www.atmarkit.co.jp/fjava/index/index_scala.html
// http://www.atmarkit.co.jp/ait/articles/1203/02/news118_2.html
// リテラルと型推論。
object MainLiteral {
  def main(args: Array[String]) {
    val v1 = "hoge"
    println(v1.getClass().getName())

    // Int
    val v02 = 10
    println(v02.getClass().getName())
    // 16進数
    val v03 = 0xFF
    println(v03.getClass().getName())

    // Long
    val v04 = 10L
    println(v04.getClass().getName())
    val v05 = 0xFFL
    println(v05.getClass().getName())
    val v06 = 10: Long
    println(v06.getClass().getName())

    // Double
    val v07 = 1.1
    println(v07.getClass().getName())
    val v08 = 1.2d

    // Float
    println(v08.getClass().getName())
    val v09 = 1.1f
    println(v09.getClass().getName())
    val v10 = 1: Float
    println(v10.getClass().getName())

    // Byte
    val v11 = 123.toByte
    println(v11.getClass().getName())
    val v12 = 123.asInstanceOf[Byte]
    val v13 = 123: Byte

    // Short
    val v14 = 123: Short
    println(v14.getClass().getName())
    val v15 = 123: BigInt
    val v16 = 123.1: BigDecimal

    // Boolean
    val v17 = true
    println(v17.getClass().getName())

    //Char
    val v18 = 'a'
    println(v18.getClass().getName())

    // Symbol
    val v19 = 'aaa
    println(v19.getClass().getName())

    println("aaa\nbb\\bb")
    // ダブルクォーテーション3つで囲むとエスケープ不要となる
    println("""c:\hoge\foo\bar""")
    println("""ccc
        ddd""")
  }
}
package study002

object MainSymbol {
  def main(args:Array[String]) {
    // Stringとの違いは、Stringは同じ内容でも異なるインスタンスが存在しうる（"abc"とnew String("abc")はインスタンスが異なる）のに対し、
    // Symbolでは同じ内容ならインスタンスも等しい。
    // Symbol は Mapのキー等に使うのに向いているらしい
    println("*** symbolSample() ***")
    val v01 = 'aaa
    val v02 = Symbol("aaa")
    if (v01 eq v02) {
      println("eq")
    } else {
      println("else");
    }

    val v03 = "aaa"
    val v04 = new String("aaa")
    if (v03 eq v04) {
      println("eq")
    } else {
      println("else")
    }

  }
}

package study001

object MainMatch {
  def main(args: Array[String]): Unit = {
    val n: Int = 1
    // Javaのswitchと違い、一致したらbreakされる。"に" は出力されない
    n match {
      case 1 => println("いち")
//        到達しえない
//      case 1 | 2 => println("に")
      case _ => println("その他")
    }

    n match {
      case 1 | 2 => println("いちまたはに")
      case 3 => println("さん")
      // デフォルト
      case _ => println("その他")
    }
    
    n match {
      case n:Int => println("いんと")
    }
    
    val s0:String = "ほげ"
    s0 match {
      case "ほげ" => println("hoge")
      case _ => println("その他")
    }

//    val s1:String = new String("ほげ")
    s0 match {
//        到達しえない
//      case s1 => println("hoge")
      case _ => println("その他")
    }

    // どれもマッチしない時は、MatchError　となる
    n match {
      case 9 => println("きゅう")
    }

  }
}
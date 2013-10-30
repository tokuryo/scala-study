package study0000

// http://www.ne.jp/asahi/hishidama/home/tech/scala/index.html
object MainSyokika {

  // mainメソッド
  def main(args: Array[String]): Unit = {
    // val は、Javaのfinal相当。String。
    val v00: String = "hoge";
    println("v00:" + v00);

    // ２つまとめて初期化
    val v01, v02: String = "foo";
    println("v01:" + v01);
    println("v02:" + v02);

    // Int
    val v10: Int = 5;
    println("v10:" + v10);

    // Int２つまとめて初期化
    val v11, v12: Int = 6;
    println("v11:" + v11);
    println("v12:" + v12);

    // var は再代入可能
    var v16: String = "foo"
    v16 = "bar"
    println("v16:" + v16)

    var n: Integer = 0;
    // ブロック式 は変数の個数分呼ばれる。ブロック式は最後の行を返す。
    val v13, v14, v15: Integer = {
      n += 1;
      n;
    };
    println("v13:" + v13);
    println("v14:" + v14);
    println("v15:" + v15);

    // クラスの初期化と基本型のデフォルト値
    val hoge: Hoge = new Hoge();
    println("Charデフォルト値:[" + hoge.vChar + "]");
    println("Byteデフォルト値:[" + hoge.vByte + "]");
    println("Shortデフォルト値:[" + hoge.vShort + "]");
    println("Intデフォルト値:[" + hoge.vInt + "]");
    println("Longデフォルト値:[" + hoge.vLong + "]");
    println("Floatデフォルト値:[" + hoge.vFloat + "]");
    println("Doubleデフォルト値[" + hoge.vDouble + "]");
    println("Booleanデフォルト値[" + hoge.vBoolean + "]");
    println("Stringデフォルト値[" + hoge.vString + "]");
  }

}
package study006

// 理解不足
// http://yuroyoro.hatenablog.com/entry/20100317/1268819400
// Booleanを返す関数のことを述語関数と言うらしい
// http://seratch.hatenablog.jp/entry/20111102/1320245066
// https://sites.google.com/site/scalajp/home/documentation/scala-by-example/chapter2
// https://sites.google.com/site/scalajp/home/documentation
object MainSuger2 {
  var hoge: String = null
  
  def main(args: Array[String]) {
    println(function0())
    println(function0)
    println(function1)
    println(function2)
    println(function3)
    println(function4)
    voidFunction1
    voidFunction2
    voidFunction3
    voidFunction4
    

    val v0 = function3.concat("aaa")
    println(v0)
    // 理解不足　ドットの代わりにスペースでもいいの？
    val v1 = function3 concat ("bbb")
    println(v1)
    // 理解不足 丸カッコではなくて中括弧でもいいの？
    val v2 = function3 concat { "ccc" }
    println(v2)
  }

  def function0(): String = {
    return "f0"
  }

  // 最後に評価された式が戻り値
  def function1(): String = {
    "f1"
  }

  // 引数の括弧省略
  def function2: String = {
    "f2"
  }

  // 引数の括弧省略。戻り値型省略。
  def function3 = {
    "f3"
  }

  // 引数の括弧省略。中括弧も省略
  def function4 = "f4"

  // 中括弧省略
  def setHoge(newHoge:String) = hoge = newHoge
  
  // 戻り値無しは、Unit と書く。
  def voidFunction1(): Unit = {
    println("voidFunction1")
  }
  
  // 括弧省略、Unit省略
  def voidFunction2 = {
    println("voidFunction2")
  }
  
  // 括弧省略、Unit省略、=省略
  def voidFunction3 {
    println("voidFunction3")
  }
  
  // 中括弧省略、Unit省略、
  def voidFunction4 = println("voidFunction4")
  
  // TODO 無名関数
  
  def oneToTen = {
    1 to 10
  }
}
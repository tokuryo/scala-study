package fizzbuzz

object FizzBuzz {
  
  def main(args: Array[String]) {
	  fizzbuzz1()
  }
  
  def fizzbuzz1() {
    // 実装中
    // filter 引数は、述語関数。述語関数の戻り値がtrueのデータが残る。
    // map 各要素を順番に呼び出す。
    (1 to 100).filter(x => x % 2 == 0).map(y => println(y))
  }

}
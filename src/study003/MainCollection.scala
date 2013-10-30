package study003

// http://www.atmarkit.co.jp/ait/articles/1203/15/news119.html
// http://www.tatapa.org/~takuo/scala_collections_2.8/collections.html
// http://bach.istc.kobe-u.ac.jp/lect/ProLang/org/scala-list.html
object MainCollection {

  def main(args: Array[String]): Unit = {
    collectionSample()
    collectionSample2()
  }

  def collectionSample(): Unit = {
    //不変であることは関数型言語の特徴っぽい。
    //可変な実装が少ないほど、ソースは読みやすくなる。
    //不変オブジェクトは状態が変更されないのでシンプル。
    //　→状態遷移を意識する必要が無い。
    //　→バグを減らせる。

    // List。イミュータブル。
    println("*** List ***")
    val days0 = List("火", "水")
    // イミュータブルであり、代入できない。
    // days0(0) = "火曜日"
    val days1 = "日" :: "月" :: days0
    println("days0.length : " + days0.length)
    println("days1.length : " + days1.length)
    println("days0:" + days0(0) + days0(1))
    println("days1:" + days1(0) + days1(1) + days1(2) + days1(3))
    println("days1.head:" + days1.head)
    println("days1.isEmpty:" + days1.isEmpty)

    // 不変Map
    val map = Map[String, Int]("hoge" -> 1, "bar" -> 2)
    println("""map("bar"):""" + map("bar"))
    try {
      println(map("存在しないキー"))
    } catch {
      case e: NoSuchElementException => println(e)
    }

    // 不変？異なる型の配列？
    // メソッドからの戻り値で複数要素を返したい時に便利
    val tuple = ("hoge", 10L)
    // _1 は 1番目
    println("tuple._1:" + tuple._1)
    println("tuple._2:" + tuple._2)

    // TODO 可変もいくつかコーディングしてみる
  }

  def collectionSample2(): Unit = {
    println("*** collectionSample2 ***")
    // Nil - 空（要素数が0）を表すリスト。
    val list0: List[Int] = 3 :: 1 :: 4 :: Nil
    println("list0 : " + list0)
    val list1: List[Any] = 3 :: "a" :: Nil
    println("list1 : " + list1)

    // Range - 整数の連番生成最速 1以上4未満
    val range0 = Range(1, 4)
    println("range0 : " + range0)
    // toList
    val list2 = range0.toList
    println("list2 : " + list2)
    // Range
    val range2 = 5 to 8
    println("range2 : " + range2)

    // 先頭要素
    val head0: Int = list2.head
    println("head0 : " + head0)
    // 最後の要素
    println("list2.last : " + list2.last)

    // 先頭要素の削除
    val list4: List[Int] = list2.tail
    println("list2 : " + list2) // 不変(イミュータブル)なのでlist2は変わらない
    println("list4 : " + list4)
    // 末尾要素の削除
    println("list2.init : " + list2.init)

    // 先頭に要素を付け加える
    val list5: List[Int] = 9 :: list2
    println("list2 : " + list2) // 不変(イミュータブル)なのでlist2は変わらない
    println("list5 : " + list5)
    println("9 +: list2" + (9 +: list2)) // :: と同じ
    // 末尾に要素を付け加える
    println("list2 :+ 9 : " + (list2 :+ 9))

    println("list2.length : " + list2.length) // 長さ。lengthでもsizeでもいい。
    println("list2.size : " + list2.size) // 長さ。lengthでもsizeでもいい。
    println("list2.isEmpty : " + list2.isEmpty)
    val list6 = List(1, 2)
    val list7 = List(1, 2)
    println("list6 eq list7 : " + (list6 eq list7)) // Javaの==相当
    println("List(1, 2) == List(1, 2) : " + (List(1, 2) == List(1, 2))) // Javaのequals相当

    // n番目の要素
    println("list2.apply(1) : " + list2.apply(1)) // どちらでも良い
    println("list2.apply(1) : " + list2(1)) // どちらでも良い
    
    // Listの連結
    println("List(3, 4) ::: List(5, 6) " + (List(3, 4) ::: List(5, 6)))
    // ソート昇順
    println("List(2, 1, 3).sorted" + List(2, 1, 3).sorted)
  }
}
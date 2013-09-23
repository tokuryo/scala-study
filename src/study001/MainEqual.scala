package study001

object MainEqual {
  def main(args: Array[String]): Unit = {
    val a1: String = new String("aaa")
    val a2: String = new String("aaa")
    // Java の equlas は、scala では ==
    println("a1 == a2 : " + (a1 == a2))
    // Java の ==　は、scala では eq
    println("a1 eq a2 : " + (a1 eq a2))
  }
}
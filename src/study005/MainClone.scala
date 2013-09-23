package study005

object MainClone {
  def main(args: Array[String]) {
    val classA1 = new ClassA
    classA1.var01 = "value01"
    classA1.classB = new ClassB()
    classA1.classB.var11 = "value11"
    val classA2 = classA1.clone()

    classA1.var01 = "value01edited"
    classA1.classB.var11 = "value11edited"

    println("classA1 : " + classA1)
    println("classA2 : " + classA2)

  }
}

package study005

object MainClone {
  def main(args: Array[String]) {
    val classA1 = new ClassA
    classA1.varInA = "valueA"
    classA1.classB = new ClassB()
    classA1.classB.varInB = "valueB"

    val classA2 = classA1.clone()

    classA1.varInA = "valueAedited"
    classA1.classB.varInB = "valueBedited"

    println("classA1 : " + classA1)
    println("classA2 : " + classA2)
  }
}

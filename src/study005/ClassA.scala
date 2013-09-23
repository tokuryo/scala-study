package study005

@cloneable
class ClassA {
  var varInA: String = null
  var classB: ClassB = null

  override def toString: String = {
    varInA + ", ClassB : " + classB
  }

  override def clone(): ClassA = {
    val classA = super.clone().asInstanceOf[ClassA]
    classA.classB = classA.classB.clone()
    classA
  }
}

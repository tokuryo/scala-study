package study005

/**
 * Created with IntelliJ IDEA.
 * User: tokuryo
 * Date: 13/09/12
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
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

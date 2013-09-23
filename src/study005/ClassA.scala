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
  var var01: String = null
  var classB: ClassB = null

  override def toString: String = {
    var01 + ", ClassB : " + classB
  }

  override def clone() = {
    val classA = super.clone().asInstanceOf[ClassA]
    classA.classB = classA.classB.clone()
    classA
  }
}

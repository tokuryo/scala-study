package study005

@cloneable
class ClassB {
  var varInB: String = null

  override def toString(): String = {
    varInB
  }

  override def clone() = super.clone().asInstanceOf[ClassB]
}


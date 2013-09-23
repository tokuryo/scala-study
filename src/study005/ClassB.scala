package study005

@cloneable
class ClassB {
  var var11: String = null

  override def toString(): String = {
    var11
  }

  override def clone() = super.clone().asInstanceOf[ClassB]
}


package lectures.par1basics

object ValuesVariablesTypes extends App {
  //val's are immutable
  //Types of val are optional (Compiler can infer types)
  val x: Int = 33
  val y = 28
  println(y)
  val str: String = "Hello"
  val bool: Boolean = true
  val c: Char = 'a'
  val s: Short = 2435
  val l: Long = 2343434554353534L
  val d: Double = 3.14
  //
  var avar: Int = 38
  avar = 33 //side effects
}

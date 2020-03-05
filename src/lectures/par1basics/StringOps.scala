package lectures.par1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"
  //JAVA
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toUpperCase)
  println(str.length)
  //SCALA
  val aNumStr = "45"
  val aNum = aNumStr.toInt
  println('a' +: aNumStr :+ 'z')
  println(str.reverse)
  println(str.take(2))
  val name = "David"
  val age = 12
  //S-interpolator
  val greet = s"Hello, my name is $name and I am $age years old"
  val anotherGreet = s"Hello, my name is $name and I will be turning ${age + 1} years old"
  println(anotherGreet)
  val speed = 1.2f
  //f-interpolator
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)
  //raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}

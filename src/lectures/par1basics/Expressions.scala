package lectures.par1basics

object Expressions extends App {
  val x = 1+2 //Expression
  println(x)
  println(2 + 3 * 4) //+ - * / % & | >> <<
  println(1 == x) //== != > < >=
  println(!(1==x)) //! && ||
  var y = 2
  y += 3
  println(y)
  //Instruction (DO) vs Expression (VALUE)
  val aCond = true
  val aCondValue = if(aCond) 5 else 2 //If Expression
  println(aCondValue)
  //Loops
  var i = 0
  val aWhile = while(i < 10){
    println(i)
    i += 1
  }
  val weird = (y = 5) //Unit === void
  println(weird)

  val codeblock = {
    val y = 2
    val z = y + 1
    if(z > 2) "Hello" else "Goodbye"
  }
  println(codeblock)
}

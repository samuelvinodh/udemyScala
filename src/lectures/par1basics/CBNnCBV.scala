package lectures.par1basics

object CBNnCBV extends App{
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime());
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite() // NEVER use :)
  def printFirst(x: Int, y: => Int) = print(x)
  //printFirst(infinite(),34)
  printFirst(34, infinite())
}

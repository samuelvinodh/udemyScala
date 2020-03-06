package lectures.par2oops

object OOBasics extends App{
  val person = new Person("John",26)
  println(person.age)
  person.greet("Vinodh")
  person.greet()
}

// constructor
class Person(name: String, val age: Int) {
  val x = 2
  println(1+3)
  def greet(name: String): Unit ={
    println(s"${this.name} says: Hi, $name")
  }
  //overloading
  def greet(): Unit = println(s"Hi, I'm $name")
  //multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
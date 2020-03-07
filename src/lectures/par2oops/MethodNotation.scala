package lectures.par2oops

object MethodNotation extends App{
  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
    //def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name} is nice!!"
    def isAlive: Boolean = true
    def apply(): String = s"My name is ${name} and my favorite movie is ${favoriteMovie}"
  }
  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  //syntactic sugar
  println(mary likes "Inception") //Infix notation (works with one argument methods)
  val tom = new Person("Tom","Fight Club")
  //println(mary hangOutWith tom)
  println(mary + tom)
  //println(1 + 2)
  println(1.+(2))
  val x = -1
  val y = 1.unary_- //Prefix notation (works with + - ~ !)
  //println(mary.unary_!)
  println(!mary)
  //println(mary.isAlive)
  println(mary isAlive) //Postfix notation (works with zero argument methods)
  //println(mary.apply())
  println(mary()) //apply() equivalent
}

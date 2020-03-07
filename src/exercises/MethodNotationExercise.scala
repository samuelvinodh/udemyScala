package exercises

object MethodNotationExercise extends App {
  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def +(person: Person): String = s"${this.name} hangs out with ${person.name}"
    def +(nickName: String): Person = new Person(s"${this.name} ($nickName)", favoriteMovie)
    def unary_+ : Person = new Person(name,favoriteMovie,age+1)
    def learns(subject: String): String = s"${this.name} learns $subject"
    def learnsScala(): String = learns("Scala")
    def apply(): String = s"${this.name} has favorite movie: ${this.favoriteMovie}"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }
  val mary = new Person("Mary","Inception",21)
  val maryNickName = mary + "Nice girl"
  println(maryNickName.name)
  val oldMary = +mary
  println(oldMary.age)
  println(mary learnsScala)
  println(mary(2))
}

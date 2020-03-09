package lectures.par2oops

object Objects extends App{
  //Scala doesn't have 'class' level functionality ('static')
  object Person{ //object has no parameters and are singleton
    //'static' or 'class' level
    val N_EYES = 2
    def canFly: Boolean = false
    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }
  class Person(val name: String){ //object and class with same name are COMPANIONS
    //'instance' level
  }
  println(Person.N_EYES)
  println(Person.canFly)
  val mary = Person
  val john = Person
  println(mary == john)
  val maryc = new Person("Mary")
  val johnc = new Person("John")
  println(maryc == johnc)
  //val bobby = Person.apply(maryc,johnc)
  val bobby = Person(maryc,johnc)
}

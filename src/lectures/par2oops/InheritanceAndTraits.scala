package lectures.par2oops

object InheritanceAndTraits extends App{
  //Single class inheritance
  sealed class Animal{ //sealed is preventing extend in other files
    val creatureType = "Wild"
    def eat = println("eating..")
    private def drink = println("drinking") //within class
    protected def run = println("running") //within subclass
    final def stop = println("stopped") //final keyword on member or classes
  }
  class Cat extends Animal{
    def walk = {
      run
      println(" slowly")
    }
  }
  val cat = new Cat
  cat.eat
  //cat.drink
  //cat.run
  cat.walk
  //constructor
  class Person(name: String, age: Int){
    def this(name: String) = this(name,0)
  }
  //class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
  class Adult(name: String, age: Int, idCard: String) extends Person(name)
  //overriding
  class Dog(override val creatureType: String) extends Animal {
  //class Dog extends Animal{
    //override val creatureType: String = "domestic"
    override def eat = {
      super.eat
      println("dog eating")
    }
    //override def stop = println("NA")
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)
  //type substitution (polymorphism)
  val unknownAnimal: Animal = new Dog("German")
  unknownAnimal.eat
}

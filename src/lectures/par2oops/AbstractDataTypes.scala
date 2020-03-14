package lectures.par2oops

object AbstractDataTypes extends App {

  //abstract classes
  abstract class Animal{
    val creatureType: String = "domestic"
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine" //override keyword mandatory for non-abstract methods
    def eat: Unit = println("crunch crunch")
  }

  //traits
  trait Carnivore{
    def eat(animal: Animal)
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded{
    override val creatureType: String = "Croc"
    def eat: Unit = println("nom nom nom")
    def eat(animal: Animal): Unit = println(s"I'm a Croc, I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //differences of traits and abstract classes
  //1. traits do not have constructor params
  //2. multiple traits may be inherited
  //3. trait = behavior, abstract class = type of 'thing'
}

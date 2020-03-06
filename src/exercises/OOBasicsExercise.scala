package exercises

object OOBasicsExercise extends App{
  val author = new Writer("Charles","Dickens",1812)
  val imposter = new Writer("Charles","Dickens",1812)
  val novel = new Novel("Great expectations",1861,author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(5).print
}

class Writer(firstName: String, surName: String, val year: Int){
  def fullName: String = firstName + " " + surName
}

class Novel(name: String, year: Int, author: Writer){
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0){
  //def inc = new Counter(count + 1) //immutable
  //def dec = new Counter(count - 1)
  //def inc(n: Int) = new Counter(count + n)
  //def dec(n: Int) = new Counter(count - n)
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }
  def inc(n: Int): Counter = {
    if(n<=0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter = {
    if(n<=0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}
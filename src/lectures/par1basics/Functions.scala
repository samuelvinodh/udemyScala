package lectures.par1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Hello",3))
  def aNoParamFunction(): Int = 33
  println(aNoParamFunction)
  def aRepeatedFunction(a:String, n:Int): String = {
    if(n==1) a
    else a + aRepeatedFunction(a,n-1) // Use recursion in place of loops
  }
  println(aRepeatedFunction("Hello",3))
  def aFuncWithSideEffects(a: String): Unit = println(a)
  def bigFunc(n: Int): Int = {
    def smallFunc(a:Int, b:Int): Int = a+b
    smallFunc(n,n-1)
  }

  def greetingForKids(name: String,age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }
  println(greetingForKids("David",10))
  def factorial(n: Int): Int = {
    if(n <= 0) 1
    else n * factorial(n-1)
  }
  println(factorial(5))
  def fibonaci(n: Int): Int = {
    if(n <= 2) 1
    else fibonaci(n-1) + fibonaci(n-2)
  }
  println(fibonaci(8))
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(isPrime(2003))
  println(isPrime(36))
}

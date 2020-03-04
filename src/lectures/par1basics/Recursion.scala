package lectures.par1basics

import scala.annotation.tailrec

object Recursion extends App{
  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else n * factorial(n-1)
  }
  def newFactorial(n: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if(x <= 1) accumulator
      else factorialHelper(x - 1,x * accumulator) //Tail Recursion: Use recursive call as last expression
    }
    factorialHelper(n,1)
  }
  println(newFactorial(10));
  @tailrec
  def concatHelper(s: String, n: Int, accu: String): String = {
    if(n <= 0) accu
    else concatHelper(s, n-1, accu+s)
  }
  println(concatHelper("hello",3,""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def primeHelper(x: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(x <= 1) true
      else primeHelper(x - 1, n % x != 0)
    }
    primeHelper(n/2,true)
  }
  println("Prime evaluation for 10 : "+isPrime(10))
  println("Prime evaluation for 13 : "+isPrime(13))
  //println("Prime evaluation for 2003 : "+isPrime(2003))
  //println("Prime evaluation for 629 : "+isPrime(629))

  def fibonacci(n: Int): Int = {
    def fiboHelper(x: Int, last: Int, nextLast: Int): Int = {
      if(x >= n) last
      else fiboHelper(x + 1, last + nextLast, last)
    }
    if(n<=2) 1
    else fiboHelper(2,1,1)
  }
  print(fibonacci(6))
}

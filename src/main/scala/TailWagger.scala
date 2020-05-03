// trait example
package main.scala

trait TailWagger {
  def test() = println("Test message method")
  def startTail()
  def stopTail()
  def add(a:Int,b:Int) ={
    var sum = a+b
    println(sum)
  }
}
trait Speaker {
  def speak() = println("test speak")
}


// Singleton object Example
// Singleton Object is where we can define class name instead of class name and we no need to initialize these singleton objects

package main.scala

object SingletonExample {
  def main(args: Array[String]): Unit ={
    SingletonObject.show()
  }
}
object SingletonObject{
  def show(): Unit ={
    println("Singleton object Example")
  }
}
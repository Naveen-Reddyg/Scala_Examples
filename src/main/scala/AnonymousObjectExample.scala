//Example for the anonymous object
package main.scala

class testAnonymous{
  def add(a:Int,b:Int) ={
    val add = a+b
    println ("Sum is",add)
  }
}
object AnonymousObjectExample {
  def main(args: Array[String]): Unit = {
    new testAnonymous().add(10,10)
  }

}

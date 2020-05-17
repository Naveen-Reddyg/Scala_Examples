// scala trait extend example
package main.scala

class Dog extends TailWagger {
    def startTail() = println("tail is wagging")

    def stopTail(): Unit = println("tail is stopped")
    override def test() = println("Woo hoo")
  }
object Example extends Speaker {
  def main(args: Array[String]): Unit = {
    val d1 = new Dog
    d1.startTail()
    d1.stopTail()
    speak()
    d1.add(1,2)
    d1.test()

  }
}

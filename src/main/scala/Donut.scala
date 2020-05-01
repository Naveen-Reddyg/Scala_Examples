package main.scala
class Donut(name:String,productCode: Long){
  def print = println(s"Donut name is $name and product Code is $productCode")
}

object Donut {
  def apply(name: String, productCode: Long): Donut = new Donut(name, productCode)

  val gazedDonut = Donut("gazed Donut", 1111)
  gazedDonut.print
  val vanillaDonut = Donut("vanilla Donut", 2222)
  vanillaDonut.print
  def main(args: Array[String]): Unit = {
  }
}

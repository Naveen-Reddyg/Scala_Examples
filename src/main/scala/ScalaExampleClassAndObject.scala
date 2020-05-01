//Class with object example

class StudentExample(id:Int,name:String){
  def show(): Unit ={
    println("Id is",id +" and name is "+name )
  }
}
object ScalaExampleClassAndObject {
  def main(args: Array[String]): Unit = {
    val s1 = new StudentExample(1,"Ram")
    s1.show()

  }

}

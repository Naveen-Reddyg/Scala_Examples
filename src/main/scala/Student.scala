class Student {
  var id = 0;
  var name = null;
}
object MainObject{
  def main(args: Array[String]): Unit = {
    var s1 = new Student()
    println(s1.id)
    println(s1.name)
  }
}

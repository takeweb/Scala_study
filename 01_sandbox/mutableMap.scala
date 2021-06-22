import scala.collection.mutable

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big x on groud.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))
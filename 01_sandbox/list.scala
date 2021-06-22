val oneTow = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTow ::: threeFour
println(oneTow + " and " + threeFour + " were not mutated.")
println("Thus. " + oneTwoThreeFour + " is a new list.")

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

// val oneTwoThree2 = 1 :: 2 :: 3 ・・・NG
val oneTwoThree2 = 1 :: 2 :: 3 :: Nil
println(oneTwoThree2)

val aaa = List()
println(aaa)

val bbb = Nil
println(bbb)

var ccc = List("Cool", "tools", "rule")
println(ccc)

var thrill = "Will" :: "fill" :: "until" :: Nil
println(thrill)

var ddd = List("a", "b") ::: List("c", "d")
println(ddd)

var eee = thrill(2)
println(eee)

var fff = thrill.count(s => s.length ==4)
println(fff)

var ggg = thrill.drop(2)
println(ggg)

var hhh = thrill.dropRight(2)
println(hhh)

var iii = thrill.exists(s => s == "until")
println(iii)

var jjj = thrill.filter(s => s.length == 4)
println(jjj)

var kkk = thrill.forall(s => s.endsWith("l"))
println(kkk)

thrill.foreach(s => print(s))
println("")
thrill.foreach(print)
println("")
println(thrill.head)
println(thrill.init)
println(thrill.isEmpty)
println(thrill.last)
println(thrill.length)
println(thrill.map(s =>s + "y"))
println(thrill.mkString(", "))
println(thrill.filterNot(s =>s.length ==4))
println(thrill.reverse)
println(thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))
println(thrill.tail)
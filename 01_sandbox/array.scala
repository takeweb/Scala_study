val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2)
    print(greetStrings(i))

greetStrings.update(0, "Good ")
greetStrings.update(1, "night, ")
greetStrings.update(2, "earth!\n")
for (i <- 0 to(2))
    print(greetStrings.apply(i))

val numNames = Array("zero", "one", "two")
for (i <- 0 to 2)
    print(numNames(i))
println("")

var numNames2 = Array.apply("zero", "one", "two")
for (i <- 0 to(2))
    print(numNames2.apply(i))
println("")

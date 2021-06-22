var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))

val msg = "Hello, world!"
println(msg)

val msg2: java.lang.String = "Hello, again, world!!"
println(msg2)

val msg3: String = "Hello yet again, world!!!"
println(msg3)

var greeting = "Hello, world!"
println(greeting)

def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
}
println(max(3,5))

def max2(x: Int, y: Int) = if (x > y) x else y
println(max2(3,5))

def greet() = println("Hello, world!")
println(greeting)

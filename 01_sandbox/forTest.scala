printArgs1(args)
printArgs2(args)
printArgs3(args)
println(formatArgs(args))

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")

def printArgs1(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
        println(args(i))
        i += 1
    }
}

def printArgs2(args: Array[String]): Unit = {
    for (arg <- args)
        println(arg)
}

def printArgs3(args: Array[String]): Unit = {
    args.foreach(println)
}

def formatArgs(args: Array[String]) = args.mkString("\n")

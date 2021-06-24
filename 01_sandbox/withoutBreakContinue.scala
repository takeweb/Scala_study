var i = 0
var j = 0
var foundIt = false

while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
      j = i
  }
  i = i + 1
}

println(args(j))
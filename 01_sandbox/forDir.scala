val filesHere = (new java.io.File(".")).listFiles

// for (file <- filesHere)
//   println(file)

// for (file <- filesHere if file.getName.endsWith(".class"))
//   println(file)

// for (
//   file <- filesHere
//   if file.isFile
//   if file.getName.endsWith(".class")
// ) println(file)

def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines().toArray

// def grep(pattern: String) = 
//   for (
//     file <- filesHere
//     if file.getName.endsWith(".scala");
//     line <- fileLines(file)
//     if line.trim.matches(pattern)
//  ) println(s"$file: ${line.trim}")

// def grep(pattern: String) = 
//   for (
//     file <- filesHere
//     if file.getName.endsWith(".scala");
//     line <- fileLines(file);
//     trimmed = line.trim
//     if trimmed.matches(pattern)
//  ) println(s"$file: $trimmed")

//  grep(".*gcd.*")

 def scalaFiles = 
   for (
       file <- filesHere
       if file.getName.endsWith("forDir.scala")
   ) yield file

val aaa = scalaFiles
for (line <- aaa)
  println(line)

val forLineLength = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file);
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

for (ccc <- forLineLength)
  println(ccc)
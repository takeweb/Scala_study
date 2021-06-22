import ChecksumAccumulator.calculate

object FallWinterSpringSummper extends App {
  for (season <- List("fall", "winter", "spring", "summer"))
    println(season + ": " + calculate(season))
}
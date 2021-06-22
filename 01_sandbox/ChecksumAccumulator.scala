import scala.collection.mutable

// ChecksumAccumulator.scala
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private val chache = mutable.Map.empty[String, Int]
  def calculate(s: String): Int =
    if (chache.contains(s))
      chache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      chache += (s -> cs)
      cs
    }
}

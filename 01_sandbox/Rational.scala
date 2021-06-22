class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  // 補助コンストラクター
  def this(n: Int) = this(n, 1)

  override def toString = s"$numer/$denom"

  def + (that: Rational): Rational =
    new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    )

  def + (i: Int): Rational = 
    new Rational(numer + i * denom, denom)

  def - (that: Rational): Rational = 
    new Rational(
      this.numer * that.denom - that.numer * this.denom,
      this.denom * that.denom
    )

  def - (i: Int): Rational = 
    new Rational(numer - i * denom, denom)
 
  def * (that: Rational): Rational = 
    new Rational(this.numer * that.numer, this.denom * that.denom)

  def * (i: Int): Rational = 
    new Rational(numer * i, denom)

  def / (that: Rational): Rational = 
    new Rational(this.numer * that.denom, this.denom * that.numer)

  def / (i: Int): Rational = 
    new Rational(numer, denom * i)

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = 
    if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int = 
    if (b == 0) a else gcd(b, a % b)
}
class Rational(n: Int, d: Int) {
  require(d !=0)

  override def toString = n + "/" + d

  def add(that: Rational): Rational = {
    new Rational(n * that.d + that.n * d, d * that.d)
  }
}

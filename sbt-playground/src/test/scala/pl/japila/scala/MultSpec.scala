package pl.japila.scala

import org.scalatest._

class MultSpec extends FlatSpec {
  "Mult 1" should "return 1x1 multiplication table" in {
    val mult = new Mult(1)
    assert(mult.cols === 1)
  }
}
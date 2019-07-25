package it.manse.utils.algorithm

import it.manse.utils.algorithm.kmp.KnuthMorrisPrattAlgo
import org.scalatest.{BeforeAndAfter, FunSuite}

abstract class AlgorithmTest extends FunSuite with BeforeAndAfter {

  protected def algo(t: String, p: String): Algorithms = new KnuthMorrisPrattAlgo(t, p)

  test("PatternNotFound") {
    val text = "Hello world"
    val pattern = "ciao"

    assert(-1 == algo(text, pattern).compute())
  }

  test("AtBegin") {
    val text = "Hello world"
    val pattern = "He"

    assert(0 == algo(text, pattern).compute())

  }

  test("InTheMiddle") {
    val text = "Hello world"
    val pattern = "o w"

    assert(4 == algo(text, pattern).compute())
  }

  test("AtTheEnd") {
    val text = "Hello world"
    val pattern = "ld"

    assert(9 == algo(text, pattern).compute())
  }

  test("TextIsNull") {
    val text = null
    val pattern = "something"

    assertThrows[Exception] { algo(text, pattern).compute() }
  }
}

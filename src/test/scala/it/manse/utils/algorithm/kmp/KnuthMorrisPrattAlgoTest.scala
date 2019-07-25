package it.manse.utils.algorithm.kmp

import it.manse.utils.algorithm.AlgorithmTest

class KnuthMorrisPrattAlgoTest extends AlgorithmTest {

  override def algo(t: String, p: String) = new KnuthMorrisPrattAlgo(t, p)

}

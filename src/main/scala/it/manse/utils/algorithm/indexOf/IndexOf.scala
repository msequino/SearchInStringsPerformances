package it.manse.utils.algorithm.indexOf

import it.manse.utils.algorithm.Algorithms

class IndexOf(override val text: String, override val pattern: String) extends Algorithms {

  override def compute(): Integer = {
    //this.text.indexOf(pattern)
    var i = 0
    var m = 0
    val S = text
    val P = pattern

    val sLength = text.length
    val pLength = pattern.length
    var firstOccurrence: Integer = new Integer(-1)
    while(m < sLength && firstOccurrence == -1) {
      if(S.charAt(m + i) == P.charAt(i)) {
        if(i == pLength - 1)
          firstOccurrence = new Integer(m)
        else
          i += 1
      } else {
        m += 1
        i = 0
      }
    }


    firstOccurrence
  }
}

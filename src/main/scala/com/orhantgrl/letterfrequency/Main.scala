package com.orhantgrl.letterfrequency

/**
 * @author orhantgrl
 *         created on 01/18/20.
 */

class Main() {
  def calculate(str: String) {
    val words: Array[Char] = str.toCharArray
    val states = collection.mutable.Map[Char, Int]()

    for (w <- words) {
      if (states contains w) {
        states += (w -> (states(w) + 1))
      } else {
        states += (w -> 1)
      }
    }

    states.foreach {
      case (k, v) => if (v >= 2) {
        println(s"Key: $k Value: $v")
      }
    }
  }
}

object Run extends App {
  val str = "ScalaProgramming"
  new Main().calculate(str)
}
package com.sofiaa.fizzbuzz

object FizzBuzz {
  def getResult(int: Int): String = {
    if (int % 15 == 0)     "fizzbuzz"
    else if (int % 5 == 0) "buzz"
    else if (int % 3 == 0) "fizz"
    else                   int.toString
  }
}

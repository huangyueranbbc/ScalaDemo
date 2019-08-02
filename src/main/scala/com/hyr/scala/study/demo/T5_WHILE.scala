package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-05 15:05
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  ******************************************************************************/
object T5_WHILE {

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      var temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcd(x: Long, y: Long): Long =
    if (y == 0) x else gcd(y, x % y)

  def main(args: Array[String]): Unit = {
    println(gcdLoop(1, 3))

    var line = ""

    do {
      line = readLine()
      println("Read: " + line)
    } while (line != "")

    // While 循环没有值。Unit（赋值语句返回值）和 String 做不等比较永远为 true。 避免使用while
    //while (!(line = readLine()).equals(""))
    //  println("ReadLine: " + line)

    println(gcd(3,4))
  }


}

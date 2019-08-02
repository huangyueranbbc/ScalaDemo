package com.hyr.scala.study.demo

import java.text.SimpleDateFormat
import java.util.Date

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 在 Scala 函数内定义函数，定义在函数内的函数称之为局部函数。
  ******************************************************************************/
object T7_6_内嵌函数 {

  def main(args: Array[String]) {
    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
  }

  def factorial(i: Int): Int = {
    /**
      * 函数内部定义了一个函数
      *
      * @return
      */
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }

    // 调用局部函数
    fact(i, 1)
  }

}

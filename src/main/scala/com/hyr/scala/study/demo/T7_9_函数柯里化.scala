package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 将原来接受两个参数的函数变成新的接受一个参数的函数的过程
  ******************************************************************************/
object T7_9_函数柯里化 {

  def add(x: Int, y: Int): Int = x + y


  def add_currying(x: Int)(y: Int): Int = x + y

  def add_currying_essence(x: Int): Int => Int = (y: Int) => x + y


  def main(args: Array[String]): Unit = {
    val result1 = add(1, 2)
    println(result1)

    val result2 = add_currying(2)(3)
    println(result2)

    val result3 = add_currying_essence(4)(5)
    println(result3)

  }


}

package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
  * *****************************************************************************/
object T8_闭包 {

  var factor = 3
  var add: Int => Int = (i: Int) => i * factor


  def main(args: Array[String]): Unit = {
    println(add)
    println(add(2))

  }

}

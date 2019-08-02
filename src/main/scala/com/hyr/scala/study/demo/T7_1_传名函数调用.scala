package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T7_1_传名函数调用 {

  def main(args: Array[String]) {
    delayed(time()) // 传名函数
  }

  def time(): Long = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delayed( t: => Long ): Long = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t // 传名函数调用
  }

}

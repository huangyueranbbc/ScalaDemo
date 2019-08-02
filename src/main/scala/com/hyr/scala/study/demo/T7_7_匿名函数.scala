package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T7_7_匿名函数 {

  // 匿名函数
  var inc: Int => Int = (x: Int) => x + 1

  // 匿名函数
  def add2: Int => Int = new Function1[Int,Int]{
    def apply(x:Int):Int = x+1
  }

  def main(args: Array[String]) {
    println( "multiplier(1) value = " +  multiplier(1) )
    println( "multiplier(2) value = " +  multiplier(2) )
  }
  var factor = 3
  val multiplier: Int => Int = (i:Int) => i * factor

}

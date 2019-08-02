package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  ******************************************************************************/
object T7_4_默认参数值 {

  def main(args: Array[String]): Unit = {
    printInt(4,5)
    printInt()
  }

  /**
    * 给参数设置默认值,如果没有传入，则为默认设置的值
    */
  def printInt(a:Int=2,b:Int=3): Unit ={
    println("a:"+a)
    println("b:"+b)
  }

}

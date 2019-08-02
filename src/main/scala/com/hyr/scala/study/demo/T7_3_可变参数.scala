package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  ******************************************************************************/
object T7_3_可变参数 {

  def main(args: Array[String]): Unit = {
    printString("1")
    printString("1","2")
    printString("1","2","3")
  }

  /**
    *
    * @param args 可变参数
    */
  def printString(args: String*): Unit = {
    for (arg <- args) {
      println(arg)
    }
    println("==================")
  }

}

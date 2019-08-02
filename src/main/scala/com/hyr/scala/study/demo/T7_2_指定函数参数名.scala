package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T7_2_指定函数参数名 {

  def main(args: Array[String]): Unit = {
    printInt(3,2)
    printInt(b=3,a=2) // 指定传入参数对应的参数名
  }

  def printInt(a:Int,b:Int): Unit ={
    println("a:"+a)
    println("b:"+b)
  }

}

package com.hyr.scala.study.demo

import java.text.SimpleDateFormat
import java.util.Date

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * 高阶函数（Higher-Order Function）就是操作其他函数的函数。
  * Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果。
  ******************************************************************************/
object T7_5_高阶函数 {

  def main(args: Array[String]): Unit = {
    val date = getDate(dateForMat,1995123319923l)
    println(date)
  }

  /**
    * 通过dateForMat方法来将毫秒时间转换为时间字符串
    * @param dateForMat   处理时间函数
    * @param timestamp    时间毫秒数
    * @return
    */
  def getDate(dateForMat:Long=>String, timestamp: Long): String = {
    dateForMat(timestamp)
  }

  def dateForMat(timestamp: Long): String = {
    val date = new Date(timestamp)
    val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    format.format(date)
  }

}

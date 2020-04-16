package com.hyr.scala.study.demo

import java.util.Date

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 某些情况下，方法中参数非常多，调用这个方法非常频繁，每次调用只有固定的某个参数变化，其他都不变，可以定义偏应用来实现
  * *****************************************************************************/
object T7_8_偏应用函数 {


  def main(args: Array[String]): Unit = {
    log(new Date(),"aaa")
    Thread.sleep(1000)
    log(new Date(),"bbb")
    Thread.sleep(1000)
    log(new Date(),"ccc")
    Thread.sleep(1000)

    val date = new Date()
    val logWithDate = log(date,_:String) // _ 表示缺失参数值

    logWithDate("aaa")
    Thread.sleep(1000)
    logWithDate("bbb")
    Thread.sleep(1000)
    logWithDate("ccc")
    Thread.sleep(1000)
  }

  def log(date: Date, message: String): Unit = {
    println(date + "------" + message)
  }


}

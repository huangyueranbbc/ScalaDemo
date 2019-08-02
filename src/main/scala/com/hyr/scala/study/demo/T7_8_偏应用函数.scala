package com.hyr.scala.study.demo

import java.util.Date

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
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

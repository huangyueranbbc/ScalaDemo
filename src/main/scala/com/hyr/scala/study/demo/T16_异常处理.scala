package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 异常处理 跟java一样
  ******************************************************************************/
object T16_异常处理 {

  def main(args: Array[String]): Unit = {
    try {
      throw new NullPointerException
    } catch {
      case exception: NullPointerException =>
        exception.printStackTrace()
      case exception: Exception =>
        exception.printStackTrace()
    } finally {
      println("finally.")
    }
  }

}

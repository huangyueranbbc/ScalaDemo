package com.hyr.scala.study.demo

import scala.util.matching.Regex

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 正则表达式
  ******************************************************************************/
object T15_正则表达式 {

  def main(args: Array[String]): Unit = {
    val pattern = new Regex("(S|s)cala") // 首字母可以是大写 S 或小写 s
    val str = "Scala is scalable and cool"

    println((pattern findAllIn str).mkString(",")) // 使用逗号 , 连接返回结果
    println(pattern.replaceFirstIn(str,"Python"))
  }

}

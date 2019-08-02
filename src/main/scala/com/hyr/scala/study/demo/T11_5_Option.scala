package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 集合-Option
  ******************************************************************************/
object T11_5_Option {

  // Option(选项)类型用来表示一个值是可选的（有值或无值)。
  // 如果值存在， Option[T] 就是一个 Some[T] ，如果不存在， Option[T] 就是对象 None 。
  def main(args: Array[String]): Unit = {
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
    println(value1)
    println(value2)

    println(show(value1))
    println(show(value2))

    // 没有值则返回默认值
    println(value1.getOrElse("哈哈"))
    println(value2.getOrElse("哈哈"))
    println("value2.isEmpty:" + value2.isEmpty)
  }

  def show(x: Option[String]): String = x match {
    case Some(s) => s
    case None => "?"
  }

}

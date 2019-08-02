package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 集合-Tuple
  ******************************************************************************/
object T11_4_Tuple {

  def main(args: Array[String]): Unit = {
    val tuple = (1, "a", "b", 5.4, true)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)
    println(tuple._5)

    val t1 = Tuple3(1, "hello", Console)
    println(t1.toString())

    // 交换
    val t2= Tuple2(1,2)
    println(t2.swap)


  }

}

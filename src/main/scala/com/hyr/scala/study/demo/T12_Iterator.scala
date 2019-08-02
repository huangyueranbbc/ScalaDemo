package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 集合-Iterator
  * *****************************************************************************/
object T12_Iterator {

  def main(args: Array[String]): Unit = {
    val iterator = Iterator("Baidu", "Google", "Tengxun", "Taobao")
    while (iterator.hasNext) {
      println(iterator.next())
    }

    val it1 = Iterator(1, 2, 3, 4, 5)
    println("max:" + it1.max)
    val it2 = Iterator(1, 2, 3, 4, 5)
    println("min:" + it2.min)

  }


}

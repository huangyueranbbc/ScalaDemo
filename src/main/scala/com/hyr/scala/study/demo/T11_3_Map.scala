package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 集合-Map
  ******************************************************************************/
object T11_3_Map {

  def main(args: Array[String]): Unit = {
    var map: Map[String, Int] = Map() // 空map
    // 可变Map
    var map1: scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map1)
    map1 += ("d" -> 4)
    map1 += ("e" -> 5)
    println(map1)

    println("keys:" + map1.keys)
    println("values:" + map1.values)
    println("map is empty:" + map1.isEmpty)
    // 不可变Map
    val map2: Map[String, String] = Map("j" -> "j", "k" -> "k")
    println(map1 ++ map2)

    map1.keys.foreach {
      key =>
        println("key:" + key)
        println("value:" + map1.get(key))
    }

    println("map1.contains(\"b\"):"+map1.contains("b"))

    println(map1.size)

    // 可变Map删除操作
    println(map1.remove("a"))
    println(map1)
    map1.clear()
    println(map1)

  }

}

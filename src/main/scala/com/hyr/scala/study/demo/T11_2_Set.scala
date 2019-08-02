package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 集合-Set
  ******************************************************************************/
object T11_2_Set {

  def main(args: Array[String]): Unit = {
    val set = Set(5, 1, 7, 3) // 不可变集合
    println(set.getClass.getName)
    println(set.drop(2)) // 删除2个元素

    val set1 = scala.collection.mutable.Set(5, 1, 7, 6) // 可变集合
    println(set1.getClass.getName)
    println(set1.remove(6))
    println(set1.add(3))
    set1 += 4
    set1 += 8
    println(set1)
    println(set1.toSet.getClass.getName)

    val set2 = Set("aa", "bb", "cc")
    val set3 = Set("hh", "jj")
    println(set2 ++ set3) // 连接2个set集合

    val set4 = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val set5 = Set(1, 4, 7, 9, 11, 15)
    println("max:" + set4.max)
    println("min:" + set4.min)
    // 交集
    println(set4.&(set5))
    println(set4.intersect(set5))
    // 差集
    println(set4.&~(set5))
    println(set4.sum)

    val list = set4.toList
    println(list.getClass.getName)
    println(list)

  }

}

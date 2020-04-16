package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 集合-列表
  ******************************************************************************/
object T11_1_列表 {

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4)
    val emptyList: List[Nothing] = List()
    // 二维列表
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    // :: 构造list   x :: y 将x追加到y列表的头部
    val list1 = 1 :: (2 :: (3 :: (4 :: Nil)))
    for (i <- list1) {
      println(i)
    }

    val list2 = (4 :: Nil) :+ 5 // :+ 构造list  x :+ y  将y追加到列表的尾部
    println(list2.foreach(println))

    val emptyList1 = Nil

    // 列表的操作
    println("head:" + list1.head)
    println("end:" + list1.last)
    println("除第一个元素外的其他元素:" + list1.tail)
    println("is empty:" + emptyList1.isEmpty)

    val list_a = "a" :: ("b" :: ("c" :: ("d" :: Nil)))
    val list_b = "h" :: ("i" :: ("j" :: ("k" :: Nil)))
    // 把list_b加到list_a的头部
    val lt1 = list_a.:::(list_b)
    println("list_a.:::(list_b) is:" + lt1)
    // 把list_a加到list_b的头部
    val lt2 = list_a ::: list_b
    println("list_a ::: list_b is:" + lt2)

    val lt3 = List.concat(list_a, list_b)
    println("List.concat(list_a,list_b) is:" + lt3)

    val lt4 = List.fill(5)("i am list.")
    println("List.fill(5)(\"i am list.\") is:" + lt4)

    // 通过给定的函数创建 6 个元素
    val squares = List.tabulate(6)(n => n * n) // 0*0 1*1 2*2 3*3 4*4 5*5
    println(squares.length)
    println("一维 : " + squares)
    // 创建二维列表
    val mul = List.tabulate(4, 5)(_ * _)
    println("多维 : " + mul)

    println("反转:" + list1.reverse)

    // 向列表后面添加元素
    println(list1 :+ 5)
    // 想列表表头添加元素
    println(5 :: list1)
    // 判断元素是否存在
    println(list1.contains(3))
    // 过滤出大于等于2的元素
    println(list1.filter(s => s >= 2))

    //zip 拉链操作
    list1.zip(List("a", "b", "c", "d")).foreach(t => {
      println("zip key:%s  value:%s".format(t._1, t._2))
    })

    // 通过拉链方式 给每个值进行计数标识
    list1.zipWithIndex.foreach(t => {
      println("zipWitchIndex key:%s  value:%s".format(t._1, t._2))
    })

    // 迭代器
    val iterator = list1.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }

    val list3 = List[String]("hello scala", "hello java", "hello spark", "a", "abc")

    // 来一条出一条
    val mapResult: List[Array[String]] = list3.map(s => {
      s.split(" ")
    })

    // 来一条出多条
    val flatMapResult: List[String] = list3.flatMap(s => {
      s.split(" ")
    })
    mapResult.foreach(
      arr => arr.foreach {
        println("新的数组")
        println
      }
    )

    flatMapResult.foreach(
        println
    )
  }

}

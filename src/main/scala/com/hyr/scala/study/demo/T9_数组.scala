package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 数组
  * *****************************************************************************/
object T9_数组 {

  def main(args: Array[String]): Unit = {
    var arr1: Array[Int] = new Array[Int](5) // 定义数组
    arr1(0) = 1
    arr1(1) = 2
    arr1(2) = 3
    arr1(3) = 4
    arr1.update(4, 5)

    // 遍历数组
    for (i <- arr1) {
      println(i)
    }

    arr1.foreach(print)
    println

    var arr2 = Array("aa", "bb", "cc")
    println("arr2 len:" + arr2.length)
    for (i <- arr2) {
      println(i)
    }

    // 求和
    var sum = 0
    for (i <- arr1) {
      sum += i
    }
    println(sum)

    // 求最大值
    var max = arr1(0)
    // for(int i=1;i<= arr1.length;i++)
    for (i <- 1 until arr1.length) {
      if (arr1(i) > max) max = arr1(i)
    }
    println(max)

    // 二维数组
    var arr3 = Array.ofDim[Int](3, 3)

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        arr3(i)(j) = i * j
      }
    }

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        println("i:" + i + " j:" + j + "=" + arr3(i)(j))
      }
    }

    // 合并数组
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    val concatArray = Array.concat(myList1, myList2)
    for (i <- concatArray) {
      print(i+"\t")
    }
    println

    // 创建区间数组
    val arr4 = Array.range(1, 10, 1)
    val arr5 = Array.range(1, 20, 2)
    for (i <- arr4) {
      println(i)
    }
    for (i <- arr5) {
      println(i)
    }




  }

}

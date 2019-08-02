package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 集合
  * *****************************************************************************/
object T11_0_集合 {

  def main(args: Array[String]): Unit = {
    // 列表 元素线性存储，可重复
    val list = List(1,2,3,4)
    // set 不可重复，无序储存
    val set =Set(5,3,1,7)
    // map k-v映射
    val map =Map("a1"->"a1","a2"->"a2","a3"->"a3")
    // 元组 不同类型值的集合
    val tuple = (10,"bonree","bat")
    // Option 可能包含值也可能不包含值的容器
    val option:Option[Int]=Some(5)

  }

}

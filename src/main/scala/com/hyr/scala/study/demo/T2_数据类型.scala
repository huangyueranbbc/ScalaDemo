package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-05 13:18
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T2_数据类型 {

  /**
    * Byte	8位有符号补码整数。数值区间为 -128 到 127
    * Short	16位有符号补码整数。数值区间为 -32768 到 32767
    * Int	32位有符号补码整数。数值区间为 -2147483648 到 2147483647
    * Long	64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
    * Float	32 位, IEEE 754 标准的单精度浮点数
    * Double	64 位 IEEE 754 标准的双精度浮点数
    * Char	16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
    * String	字符序列
    * Boolean	true或false
    * Unit	表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
    * Null	null 或空引用
    * Nothing	Nothing类型在Scala的类层级的最低端；它是任何其他类型的子类型。
    * Nil 长度为0的list
    * Any	Any是所有其他类的超类
    * AnyRef	AnyRef类是Scala里所有引用类(reference class)的基类
    */

  def main(args: Array[String]): Unit = {
    var a:Int =1 // 变量,可变
    val b:Int =2 // 常量,不可变

    val sumMore = 1.+(2)
    require(sumMore==3) // 验证

    println(sumMore)
    println(List(1,2,3) == List (1,2,3))
    println(1 == 2)
    println(1 != 2)
    println( ("he"+"llo") == "hello")
    println(pepper() && salt())

    //位操作
    println(1 & 2)
    println(1 | 2)
    println(1 ^ 2)
    println(~1)
  }

  def salt(): Boolean = { println("salt");false}

  def pepper(): Boolean ={println("pepper");true}

  final case class Symbol private (name: String) {
    override def toString: String = "'" + name
  }

}


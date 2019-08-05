package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 模式匹配
  * *****************************************************************************/
object T14_模式匹配 {

  def main(args: Array[String]): Unit = {
    println(matchFunction("a"))
    println(matchFunction("b"))
    println(matchFunction("c"))
    println(matchFunction("d"))

    println(matchFunction1("a"))
    println(matchFunction1("1"))
    println(matchFunction1(1))
    println(matchFunction1(Int))
  }


  /**
    * 通一数据类型
    *
    * @param expression
    * @return
    */
  def matchFunction(expression: String): String = expression match {
    case "a" => "a"
    case "b" => "b"
    case "c" => "c"
    case _ => "other"
  }

  /**
    * 不同类型匹配
    * @param expression
    * @return
    */
  def matchFunction1(expression: Any): Any = expression match {
    case "a" => "a"
    case 1 => 1
    case Int => "Int.class"
    case _ => "other"
  }

}

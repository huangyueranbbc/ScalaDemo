package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-05 14:59
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T4_IF {

  def main(args: Array[String]): Unit = {
    var filename = "default.txt"
    if (!args.isEmpty)
      filename = args(0)
    println(filename)

    val filename1 =
      if (!args.isEmpty)
        args(0)
      else
        "default1.txt"
    println(filename1)

  }


}

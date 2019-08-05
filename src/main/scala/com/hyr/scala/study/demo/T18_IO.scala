package com.hyr.scala.study.demo

import java.io.PrintWriter

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 文件I/O
  ******************************************************************************/
object T18_IO {

  def main(args: Array[String]): Unit = {
    val fileWriter = new PrintWriter("test.txt")
    fileWriter.write("a\n")
    fileWriter.write("bb\n")
    fileWriter.write("ccc\n")
    fileWriter.flush()
    fileWriter.close()
  }

}

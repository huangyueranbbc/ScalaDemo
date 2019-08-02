package com.hyr.scala.study.demo

import java.io.File

/** *****************************************************************************
  * @date 2019-07-05 15:16
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T6_FOR {

  def main(args: Array[String]): Unit = {
    val file = new File(".")
    val files = file.listFiles()
    for (file <- files) {
      println(file)
    }

    listFile(new File("."))
  }

  def listFile(file: File): Unit = {
    println(file)

    if (file.isDirectory) {
      val files = file.listFiles()
      for (file <- files) {
        listFile(file)
      }
    }

  }

}

package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 注入/提取器
  ******************************************************************************/
object T17_提取器 {

  def main(args: Array[String]) {
    println("Apply 方法 : " + User.apply("Zara", "gmail.com")) // 注入
    println("Unapply 方法 : " + User.unapply("Zara@gmail.com")) // 提取
    println("Unapply 方法 : " + User.unapply("Zara Ali"))

  }

  object User {
    // 注入方法 (可选)
    def apply(user: String, domain: String): String = {
      user + "@" + domain
    }

    // 提取方法（必选）
    def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"
      if (parts.length == 2) {
        Some(parts(0), parts(1))
      } else {
        None
      }
    }
  }

}

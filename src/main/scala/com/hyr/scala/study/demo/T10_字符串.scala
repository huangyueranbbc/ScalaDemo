package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 字符串
  * *****************************************************************************/
object T10_字符串 {

  var str: String = "hello scala!"


  def main(args: Array[String]): Unit = {
    println(str)
    println(str.length)
    println(str.substring(0, 5))
    println(str.indexOf('o'))
    println("b".compareTo("b"))
    println("a".eq("b"))
    println(" aa ".trim)

    val strArr: Array[String] = "a,b,c,d".split(",")
    println(strArr.apply(0))
    for (s <- strArr) {
      println(s)
    }

    // 格式化
    var sum = 1 + 1
    printf("1+1=%d\n", sum)

    val stringBuilder = new StringBuilder
    stringBuilder.append("a_")
    stringBuilder.append("b_")
    stringBuilder.append("c_")
    println(stringBuilder.toString)


    val stringBuffer = new StringBuffer
    stringBuffer.append("a_")
    stringBuffer.append("b_")
    stringBuffer.append("c_")
    println(stringBuffer.toString)

  }

}

package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2020-04-16 10:04 AM
  * @author: <a href=mailto:huangyr>黄跃然</a>
  * @Description: 隐式转换 隐式值、隐式参数、隐式转换函数、隐式类
  * *****************************************************************************/
object T19_隐式转换 {

  def sayName(implicit name: String): Unit = {
    println(s"name is $name.")
  }

  // 含有部分隐式参数且有多个参数的的方法
  def sayAge(age: Int)(implicit name: String): Unit = {
    println(s"name is $name. age is $age")
  }

  def main(args: Array[String]): Unit = {
    // 同一个类型的隐式值同一作用域只能出现一次
    implicit val name: String = "xingxing"
    implicit val age: Int = 20
    sayName
    sayName("jiyifengyu")
    sayAge(16)
    sayAge(16)("jiyifengyu")

    // 隐式转换函数
    val demon = new Boy("Demon")
    demon.playLOL()

    val girl = new Girl("Donald Trump")
    // 通过隐式转换,让Girl也能调用Boy的方法
    girl.playLOL()

    // 调用隐式类sayName方法
    girl.sayName()
  }

  // 隐式转换函数 入参和出参类型相同的隐式转换函数同一作用域只能有一个
  implicit def GirlToBoy(girl: Girl): Boy = {
    new Boy(girl.name)
  }

  // 隐式类
  implicit class InterSex(girl: Girl){
    def sayName(): Unit ={
      println(s"${girl.name} is girl.")
    }
  }

}

class Boy(boy_name: String) {
  def playLOL(): Unit = {
    println(s"$boy_name play LOL.")
  }
}

class Girl(girl_name: String) {
  val name: String = this.girl_name
}
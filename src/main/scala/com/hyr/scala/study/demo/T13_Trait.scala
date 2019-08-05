package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-08 13:32
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 特征-Trait
  * *****************************************************************************/
object T13_Trait {

  /**
    * 调用超类的构造器；
    * 特征构造器在超类构造器之后、类构造器之前执行；
    * 特征由左到右被构造；
    * 每个特征当中，父特征先被构造；
    * 如果多个特征共有一个父特征，父特征不会被重复构造
    * 所有特征被构造完毕，子类被构造。
    */

  // eat特征
  trait Eat {
    println("Eat init.") // 初始化

    def eatApple()

    def eatOrange()
  }


  trait Drink {
    println("Drink init.") // 初始化

    def drinkWater()

    def drinkCoke()
  }

  trait Run {
    println("Run init.") // 初始化

    def runLeft()

    def runRight()
  }

  /**
    * trait可以多继承 类似java接口
    */
  trait EatAndDrink extends Eat with Drink {
    println("EatAndDrink init.") // 初始化

  }


  /**
    * 继承
    * @param user_name
    */
  class User(user_name: String) extends Run with EatAndDrink {
    val name: String = user_name

    println("User init.") // 初始化

    override def eatApple(): Unit = {
      println(name + " eat apple.")
    }

    override def eatOrange(): Unit = {
      println(name + " eat Orange.")
    }

    override def drinkWater(): Unit = {
      println(name + " drink water.")
    }

    override def drinkCoke(): Unit = {
      println(name + " drink coke.")
    }

    override def runLeft(): Unit = {
      println(name + " run left.")
    }

    override def runRight(): Unit = {
      println(name + " run right.")
    }
  }

  def main(args: Array[String]): Unit = {
    val user = new User("xiaohong")
    user.eatApple()
    user.eatOrange()
    user.drinkCoke()
    user.drinkWater()
    user.runLeft()
    user.runRight()
  }

}

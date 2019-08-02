package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-05 13:45
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T3_1_继承 {

  class User(user_name: String, user_age: Int, user_sex: String, user_email: String) {
    var name: String = user_name
    var age: Int = user_age
    var sex: String = user_sex
    var email: String = user_email


    def changeName(name: String): Unit = {
      this.name = name
    }

    def changeAge(age: Int): Unit = {
      this.age = age
    }

    def changeEmail(email: String): Unit = {
      this.email = email
    }

    def growUp(): Unit = {
      this.age += 1
    }

    override def toString = s"User($name, $age, $sex, $email)"
  }


  class SuperMan(user_name: String, user_age: Int, user_sex: String, user_email: String, super_power: Int)
    extends User(user_name: String, user_age: Int, user_sex: String, user_email: String) {

    var power: Int = super_power

    def levelUp(): Unit = {
      this.power += 1
    }

    // toString
    override def toString: String = s"SuperMan($power,$name,$age,$sex,$email)"
  }

  def main(args: Array[String]): Unit = {
    val user = new User("xiaoming", 16, "男", "445566@gmail.com")
    println(user.toString)
    user.growUp()
    user.growUp()
    user.growUp()
    user.changeEmail("jhs123@gmail.com")
    println(user.toString)

    val superMan = new SuperMan("chaoren", 666, "女", "564600111@qq.com", 1)
    println(superMan)
    superMan.changeAge(999)
    superMan.levelUp()
    superMan.levelUp()
    superMan.levelUp()
    println(superMan)


  }

}



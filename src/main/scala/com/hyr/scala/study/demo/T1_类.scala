package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-05 10:44
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * Scala ：
  * 1.Scala object相当于java中的单例，object中定义的全是静态的,相当于java中的工具类，Object不可以传参，对象要传参，使用apply方法。
  * 2.Scala中定义变量使用var，定义常量使用val ,变量可变，常量不可变.变量和常量类型可以省略不写，会自动推断。
  * 3.Scala中每行后面都会有分号自动推断机制，不用显式写出“;”
  * 4.建议在Scala中命名使用驼峰命名法
  * 5.Scala类中可以传参，传参一定要指定类型，有了参数就有了默认了构造。类中的属性默认有getter和setter方法
  * 6.类中重写构造时，构造中第一行必须先调用默认的构造 。def this(....){....}
  * 7.Scala中当new class 时，类中除了方法不执行【除了构造方法】，其他都执行。
  * 8.在同一个scala文件中，class名称和Object名称一样时，这个类叫做个对象的伴生类，这个对象叫做这个类的伴生对象，他们之间可以互相访问私有变量。
  ** ****************************************************************************/
object T1 {


  def main(args: Array[String]): Unit = {
    val accumulator = new ChecksumAccumulator
    accumulator.add(11)
    val sum = accumulator.checksum()
    print(sum)
  }

}

//  private var sum=0
//  def add(b:Byte) :Unit = sum +=b
//  def checksum() : Int = ~ (sum & 0xFF) +1
class ChecksumAccumulator {
  private var sum = 0
  def add(b:Byte):Unit=sum+=b
  def checksum():Int = sum
}


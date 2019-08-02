package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-05 13:45
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  * *****************************************************************************/
object T3_0_类与对象 {

  // 方法的定义
  // def functionName ([参数列表]) : [return type]

  class Rational (n:Int, d:Int) {
    require(d!=0)
    var number: Int =n
    var denom: Int =d

    override def toString: String = n + "/" +d

    def add(that:Rational) : Rational =
      new Rational(n*that.denom + that.denom*d,d*that.denom)

    def +(that:Rational) : Rational =
      new Rational(n*that.denom + that.denom*d,d*that.denom)

    def +(denom:Integer) : Rational =
      new Rational(n*denom + denom*d,d*denom)


    def lessThan(that:Rational): Boolean =
      this.number * that.denom < that.number * this.denom

    def moreThan(that:Rational): Boolean =
      number * that.denom > that.number * denom
  }

  def main(args: Array[String]): Unit = {
    val rational = new Rational(1,2)
    val rational1 = new Rational(3,4)
    println(rational)
    println(rational.add(rational1))
    println(rational.lessThan(rational1))
    println(rational+rational1) // 以符号名作为方法名
  }

}

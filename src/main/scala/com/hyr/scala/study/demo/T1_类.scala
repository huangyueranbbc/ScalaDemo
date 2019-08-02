package com.hyr.scala.study.demo

/** *****************************************************************************
  * @date 2019-07-05 10:44
  * @author: <a href=mailto:>黄跃然</a>
  * @Description:
  ******************************************************************************/
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


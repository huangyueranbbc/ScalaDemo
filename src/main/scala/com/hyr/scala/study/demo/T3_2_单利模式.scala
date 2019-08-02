package com.hyr.scala.study.demo

/** *****************************************************************************
  *
  * @date 2019-07-05 13:45
  * @author: <a href=mailto:>黄跃然</a>
  * @Description: 单利模式 伴生对象 object
  * *****************************************************************************/
class T3_2_单利模式 {

}

class Marker private(val color: String) {
  override def toString = s"Markers($color)"
}

/**
  * object 单利对象
  */
object Marker {
  private var markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def apply(color:String): Marker = {
    if(markers.contains(color)) markers(color) else null
  }

  def addColor(color: String): Unit = {
    markers += (color -> new Marker(color))
  }

  def getColor(color: String): Marker = {
    markers.get(color) match {
      case Some(marker) => marker
      case None => null
    }
  }

  def main(args: Array[String]): Unit = {
    println(Marker("green"))
    println(Marker getColor "red")
    println(Marker("black"))
    Marker addColor "black"
    println(Marker("black"))

  }

}


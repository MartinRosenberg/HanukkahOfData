package com.martinbrosenberg.hanukkahofdata
package year5783

trait HanukkahOfDataDay(day: Int) extends App {
  val url: String = s"https://hanukkah.bluebird.sh/5783/$day/"
  protected val inputUri: String = s"year5783/day$day/input"
}

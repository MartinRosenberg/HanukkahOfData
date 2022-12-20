package com.martinbrosenberg.hanukkahofdata
package year5783.day1

import year5783.HanukkahOfDataDay

import scala.io.Source
import scala.util.Using

object Puzzle1 extends HanukkahOfDataDay(1) {
  Using.resource(Source.fromResource(inputUri)) { resource =>
    ???
  }
}

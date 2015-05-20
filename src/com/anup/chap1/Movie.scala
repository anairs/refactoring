package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
class Movie (val _title:String, val _priceCode:Int){
  def getCharge(daysRented:Int): Double = {
    var thisAmount: Double = 0
    _priceCode match {
      case Movie.REGULAR =>
        thisAmount += 2
        if (daysRented > 2)
          thisAmount += (daysRented - 2) * 1.5

      case Movie.NEW_RELEASE =>
        thisAmount += 2
        thisAmount += daysRented * 3

      case Movie.CHILDRENS =>
        thisAmount += 2
        if (daysRented > 3)
          thisAmount += (daysRented - 3) * 1.5
    }
    thisAmount
  }
}

object Movie {
  val CHILDRENS = 2
  val REGULAR = 0
  val NEW_RELEASE = 1
}

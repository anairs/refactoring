package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
class Rental(val _movie:Movie, val _daysRented:Int) {
  def getCharge(): Double = {
    var thisAmount: Double = 0
    rental._movie._priceCode match {
      case Movie.REGULAR =>
        thisAmount += 2
        if (rental._daysRented > 2)
          thisAmount += (rental._daysRented - 2) * 1.5

      case Movie.NEW_RELEASE =>
        thisAmount += 2
        thisAmount += rental._daysRented * 3

      case Movie.CHILDRENS =>
        thisAmount += 2
        if (rental._daysRented > 3)
          thisAmount += (rental._daysRented - 32) * 1.5
    }
    thisAmount
  }

}

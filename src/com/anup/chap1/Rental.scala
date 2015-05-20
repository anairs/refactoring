package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
class Rental(val _movie:Movie, val _daysRented:Int) {
  def getCharge(): Double = {
    var thisAmount: Double = 0
    _movie._priceCode match {
      case Movie.REGULAR =>
        thisAmount += 2
        if (_daysRented > 2)
          thisAmount += (_daysRented - 2) * 1.5

      case Movie.NEW_RELEASE =>
        thisAmount += 2
        thisAmount += _daysRented * 3

      case Movie.CHILDRENS =>
        thisAmount += 2
        if (_daysRented > 3)
          thisAmount += (_daysRented - 3) * 1.5
    }
    thisAmount
  }
  
  def getFrequentRenterPoints() : Int = {
    if(_movie._priceCode == Movie.NEW_RELEASE && _daysRented > 1)
      2
    else 1
  }

}

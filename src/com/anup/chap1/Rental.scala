package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
class Rental(val _movie:Movie, val _daysRented:Int) {
  def getCharge(): Double = {
    _movie.getCharge(_daysRented)
  }
  
  def getFrequentRenterPoints() : Int = {
    if(_movie._priceCode == Movie.NEW_RELEASE && _daysRented > 1)
      2
    else 1
  }

}

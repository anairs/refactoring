package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
class Rental(val _movie:Movie, val _daysRented:Int) {
  def getCharge(): Double = {
    _movie.getCharge(_daysRented)
  }
  
  def getFrequentRenterPoints() : Int = {
    _movie.getFrequenterRenterPoints(_daysRented)
  }

}

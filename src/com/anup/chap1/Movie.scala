package com.anup.chap1

import com.anup.chap1.price.{ChildrensPrice, NewReleasePrice, RegularPrice, Price}

/**
 * Created by anup on 20/05/15.
 */
class Movie (val _title:String, val _priceCode:Int){
  val _price:Price =  _priceCode match {
    case Movie.REGULAR => RegularPrice
    case Movie.NEW_RELEASE => NewReleasePrice
    case Movie.CHILDRENS => ChildrensPrice
  }


  def getCharge(daysRented:Int): Double = {
    _price.getCharge(daysRented)
  }

  def getFrequenterRenterPoints(daysRented:Int): Int = {
    _price.getFrequenterRenterPoints(daysRented)
  }
}

object Movie {
  val CHILDRENS = 2
  val REGULAR = 0
  val NEW_RELEASE = 1
}

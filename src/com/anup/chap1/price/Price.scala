package com.anup.chap1.price

/**
 * Created by anup on 20/05/15.
 */
abstract class Price {
  def getPriceCode():Int

  def getCharge(daysRented:Int): Double

  def getFrequenterRenterPoints(daysRented:Int): Int = {
    1
  }
}

package com.anup.chap1.price

import com.anup.chap1.Movie

/**
 * Created by anup on 20/05/15.
 */
object NewReleasePrice extends Price {
  def getPriceCode: Int = {
    Movie.NEW_RELEASE
  }

  def getCharge(daysRented: Int): Double = {
    2 + daysRented * 3
  }

  override def getFrequenterRenterPoints(daysRented:Int): Int = {
    2
  }

}

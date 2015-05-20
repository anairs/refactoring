package com.anup.chap1.price

import com.anup.chap1.Movie

/**
 * Created by anup on 20/05/15.
 */
object RegularPrice extends Price {
  def getPriceCode: Int = {
    Movie.REGULAR
  }

  def getCharge(daysRented: Int): Double = {
    (if (daysRented > 2)
      (daysRented - 2) * 1.5
    else 0) + 2
  }
}

package com.anup.chap1.price

import com.anup.chap1.Movie

/**
 * Created by anup on 20/05/15.
 */
object ChildrensPrice extends Price {
  def getPriceCode: Int = {
    Movie.CHILDRENS
  }

  def getCharge(daysRented: Int): Double = {
    (if (daysRented > 3)
      (daysRented - 3) * 1.5
    else 0) + 2
  }

}

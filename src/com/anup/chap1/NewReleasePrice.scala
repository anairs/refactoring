package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
object NewReleasePrice  extends Price {
  def getPriceCode:Int = {
    Movie.NEW_RELEASE
  }
}

package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
class Customer(_name:String, _rentals:Vector[Rental]) {
  def statements:String = {
    var result:String = s"Rental Record for ${_name} \n"
    _rentals.foreach(
      rental => {
        // show results
        result += s"\t ${rental._movie._title}\t${rental.getCharge()}"
      }
    )

    result += s"Amount owed is ${getTotalCharge()} \n"
    result += s"You earned ${getTotalFrequentRenterPoints()} frequent renter points\n"
    result
  }

  def htmlStatements:String = {
    var result:String = s"<H1>Rental Record for <EM>${_name} </EM></H1><P>\n"
    _rentals.foreach(
      rental => {
        // show results
        result += s"${rental._movie._title}\t${rental.getCharge()} <BR> \n"
      }
    )

    result += s"<P>Amount owed is <EM> ${getTotalCharge()} </EM><P>\n"
    result += s"You earned <EM>${getTotalFrequentRenterPoints()} </EM> frequent renter points\n"
    result
  }

  private def getTotalCharge() : Double = {
    _rentals.map(_.getCharge()).sum
  }

  private def getTotalFrequentRenterPoints() : Int = {
    _rentals.map(_.getFrequentRenterPoints()).sum
  }
}

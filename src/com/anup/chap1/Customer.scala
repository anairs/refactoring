package com.anup.chap1

/**
 * Created by anup on 20/05/15.
 */
class Customer(_name:String, _rentals:Vector[Rental]) {
  def statements:String = {
    var totalAmount:Double = 0
    var frequentRenterPoints:Int = 0
    var result:String = s"Rental Record for ${_name} \n"
    _rentals.foreach(
      rental => {
        frequentRenterPoints += rental.getFrequentRenterPoints()

        // show results
        result += s"\t ${rental._movie._title}\t${rental.getCharge()}"
        totalAmount += rental.getCharge()
      }
    )

    result += s"Amount owed is ${totalAmount} \n"
    result += s"You earned ${frequentRenterPoints} frequent renter points\n"
    result
  }
}

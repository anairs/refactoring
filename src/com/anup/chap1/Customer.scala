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
        var thisAmount: Double = amountFor(rental)

        frequentRenterPoints += 1

        if(rental._movie._priceCode == Movie.NEW_RELEASE && rental._daysRented > 1)
          frequentRenterPoints += 1

        // show results
        result += s"\t ${rental._movie._title}\t${thisAmount}"
        totalAmount += thisAmount
      }
    )

    result += s"Amount owed is ${totalAmount} \n"
    result += s"You earned ${frequentRenterPoints} frequent renter points\n"
    result
  }

  private def amountFor(rental: Rental): Double = {
    var thisAmount: Double = 0
    rental._movie._priceCode match {
      case Movie.REGULAR =>
        thisAmount += 2
        if (rental._daysRented > 2)
          thisAmount += (rental._daysRented - 2) * 1.5

      case Movie.NEW_RELEASE =>
        thisAmount += 2
        thisAmount += rental._daysRented * 3

      case Movie.CHILDRENS =>
        thisAmount += 2
        if (rental._daysRented > 3)
          thisAmount += (rental._daysRented - 32) * 1.5
    }
    thisAmount
  }
}

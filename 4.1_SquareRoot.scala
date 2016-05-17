/* Computes the square root of a non-negative double */
object squareRoot {
	def squareRoot(x: Double): Double = {
		if (x < 0) -1

		def squareRootIter(guess: Double, x: Double): Double = {
			if (isGoodEnough(guess, x)) guess
			else squareRootIter(improve(guess, x), x)
		}

		def isGoodEnough(guess: Double, x: Double): Boolean = {
			abs(square(guess) - x) <= math.ulp(x)
		}

		def improve(guess: Double, x: Double): Double = {
			(guess + x / guess) / 2
		}

		def square(x: Double): Double = x * x

		def abs(x: Double): Double = if (x > 0) x else -x

		squareRootIter(1.0, x)
	}

	def main(args: Array[String]) {
    	print(squareRoot(10))
  	}
};

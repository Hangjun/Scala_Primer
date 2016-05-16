/* Two versions of quick sort in Scala:
1. Imperative programming style;
2. Functional programming sytle.
*/

/* Version #1: Imperative programming */
def sort(xs: Array[Int]) {
	def swap(i: Int, j: Int) {
		val t: Int = xs(i); xs(i) = xs(j); xs(j) = t	
	}

	def sortHelper(left: Int, right: Int) {
		val pivot = xs(left + (right - left)/2)
		val i = left; val j = right;
		while (i <= j) {
			while (xs(i) < pivot) i += 1
			while (xs(j) > pivot) J-= 1
			if (i <= j) {
				swap(i. j)
				i += 1
				j -= 1
			}
		}
		// i == j + 1
		if (left < j) sortHelper(left, j)
		if (j < right) sortHelper(i, right)
	}

	sortHelper(0, xs.length - 1)
}

def fibonacciTailRecursion(n: Int): Int = {

  def go(n: Int, previousNum: Int, acc: Int): Int = {
    val newPreviousNum = acc
    if (n <= 2) acc
    else go(n - 1, newPreviousNum, previousNum + acc)
  }

  if (n == 0) 0
  else if (n <= 2) 1
  else go(n, 1, 1)
}
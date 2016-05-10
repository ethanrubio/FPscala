def fibonacciTailRecursion(n: Int): Int = {

  def go(n: Int, previousNum: Int, acc: Int): Int = 
    if (n == 0) previousNum
    else go(n - 1, acc, previousNum + acc)

  go(n, 0, 1)
}
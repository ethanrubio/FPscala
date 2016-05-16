def compose[A, B, C](f: B => C, g: A => B): A => C =
  a => f(g(a))

  // f compose g
  // f andThen g is the same as g compose f
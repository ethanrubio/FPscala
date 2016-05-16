def curry[A, B, C](f: (A, B) => C): A => (B => C) = 
  (a: A) => ((b: B) => f(a, b))
  // a => b => f(a, b) -> type annotation isn't needed since Scala can know types from the context given
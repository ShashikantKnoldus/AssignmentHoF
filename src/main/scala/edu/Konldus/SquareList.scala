package edu.Konldus

class SquareList {
  def squareListWithMatchCase(xs: List[Int]): List[Int] = {
    xs match {
      case List() => List()
      case y :: ys => (y * y) :: squareListWithMatchCase(ys)
    }
  }

  def squareListWithMap(xs: List[Int]): List[Int] = {
    xs map (x => x * x)
  }

}


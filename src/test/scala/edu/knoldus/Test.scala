package edu.knoldus

import edu.Konldus.SquareList
import org.scalatest.flatspec.AnyFlatSpec

class Test extends AnyFlatSpec {
  val obj = new SquareList
  val x = List(1, 2, 3, 4, 5)
  val y = List()

  //Test case of squareListWithMatchCase

  //Test case for Non-Empty List
  "squareListWithMatchCase method" should "return the square of list" in {
    assert(obj.squareListWithMatchCase(x) == List(1, 4, 9, 16, 25))
  }

  //Test case for empty List
  "squareListWithMatchCase method" should "return empty list" in {
    assert(obj.squareListWithMatchCase(y) == List())
  }

  //Test case of squareListWithMap

  //Test case for Non-Empty List
  "squareListWithMap method" should "return the square of list" in {
    assert(obj.squareListWithMap(x) == List(1, 4, 9, 16, 25))
  }

  //Test case for empty List
  "squareListWithMap method" should "return empty list" in {
    assert(obj.squareListWithMap(y) == List())
  }
}

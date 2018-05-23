import org.scalatest._

class HelloSpec extends WordSpec with MustMatchers {

  "elementreturner" must {

    "return 1 when given a list of intergers" in {
      Hello.elementreturner(List(1)) mustEqual 1
    }
    "return 3 when given a list of intergers" in {
      Hello.elementreturner(List(-1, -2, 3, 1, 2)) mustEqual 3
    }
   "return -3 when given a list of intergers" in {
     Hello.elementreturner(List(1,2,-1,-2,-3)) mustEqual -3
   }
  }
}

